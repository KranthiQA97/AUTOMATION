package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import driverManager.WebDriverManager;

public class SeleniumHelper extends WebDriverManager {

	private static void raiseException() {
		takeScreenShot();
	}
	
	public static long currDateAndTime()
	{
		Date d = new Date();
		long currDateTime = d.getTime();
		return currDateTime;
	}

	private static void takeScreenShot() {
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir")+"/FailedScreenShots"+currDateAndTime()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement ele, String comment) {
		try {
			ele.click();
			// log.info(comment+" is clicked successfully");

		} catch (Exception e) {
			e.printStackTrace();
			raiseException();
		}

	}

}
