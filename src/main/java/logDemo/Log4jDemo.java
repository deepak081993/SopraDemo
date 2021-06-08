package logDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	 static Logger logger=LogManager.getLogger(Log4jDemo.class);

	 
		/*
		 * public static <T> void printLog(Class<T> clsName) {
		 * 
		 * String clsname= clsName.getSimpleName(); logger =
		 * LogManager.getLogger(clsname); System.out.println("Hello world   \n");
		 * 
		 * logger.info("This is information message");
		 * logger.error("This is error message");
		 * logger.warn("This is warning message");
		 * 
		 * System.out.println("Complete"); }
		 * 
		 * public static <T> void printInfo(Class<T> clsName,String infoMsg) { String
		 * clsname= clsName.getSimpleName(); logger = LogManager.getLogger(clsname);
		 * logger.info(infoMsg); }
		 * 
		 * public static <T> void printError(Class<T> clsName,String errorMsg) { String
		 * clsname= clsName.getSimpleName(); logger = LogManager.getLogger(clsname);
		 * logger.error(errorMsg); }
		 */
	
	public static void main(String[] args) {
		System.out.println("Hello world   \n");

		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");

		System.out.println("Complete");
	}
}
