package robotDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassDemo {
	static WebDriver driver;
	public void UploadFileUsingRobotClass() throws InterruptedException, AWTException {
		
		
		//Action class Click Example
		 Actions builder = new Actions(driver);
         WebElement element = driver.findElement(By.xpath("//input[@id='upload_datafile']"));
         builder.moveToElement(element).click().perform();
		
		Thread.sleep(2000);
		
		//Use of Robot Class to upload file
		
		Robot robot=new Robot();
		
		//Store the path of the file to be uploaded using StringSelection Class Object
		
		StringSelection filePath=new StringSelection("C:\\Users\\dejoshi\\eclipse-workspace\\SecureGo_2Jun\\SecureGo\\Apps\\android-vr.apk");
		//Copy above path to clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		
		//Now Press CONTROL
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		//Press V
		
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//Release V
		
		robot.keyRelease(KeyEvent.VK_V);
		
		//Release CONTROL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		// release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(10000);
		System.out.println("File Uploaded Successfully Using Robot");
		driver.close();
		
		
	}
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javadecompilers.com/apk");
		
		
		try {
			RobotClassDemo classDemo=new RobotClassDemo();
			Thread.sleep(6000);
			classDemo.UploadFileUsingRobotClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
