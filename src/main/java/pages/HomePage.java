package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@class,'nav')][contains(.,'Product')]")
	@CacheLookup
	WebElement productLink;
	
	
	
	

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
