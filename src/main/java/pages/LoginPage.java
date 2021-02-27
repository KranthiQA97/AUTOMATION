package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void method1() {
		driver.get("https://smartbear.com/");
	}

	public void method2() {
		driver.get("https://www.grammarly.com/signin");
	}

	public void method3() {
		System.out.println("Method3");
	}

}
