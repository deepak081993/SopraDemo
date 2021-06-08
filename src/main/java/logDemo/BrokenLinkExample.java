package logDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import logDemo.Log4jDemo;

public class BrokenLinkExample {
	static WebDriver driver;

	public void VerifyLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			verifyLinkActive(url);

		}
	}

	private static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				//Log4jDemo.printLog(BrokenLinkExample.class);
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			} else if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				 System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
			} else if (httpURLConnect.getResponseCode() > 200) {
				System.out.println(url + " is a broken link" + "httpURLConnect.getResponseCode()"
						+ httpURLConnect.getResponseCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 200-OK, 404- Not Found, 500- internal Error, 400- bad Request
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		BrokenLinkExample example = new BrokenLinkExample();
		example.VerifyLinks();
		driver.close();
	}
}
