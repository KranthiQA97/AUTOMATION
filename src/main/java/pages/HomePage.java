package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumHelper;

/**
 * @author			Kranthi
 * @creationdate	27-Feb-2021
 */
public class HomePage extends SeleniumHelper {

	public static WebDriver driver;
	
//	######################## Constructor ######################################
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
//	######################## Web Elements ######################################
	
	@FindBy(xpath = "//a[contains(@class,'nav')][contains(.,'Product')]")
	@CacheLookup
	WebElement productLink;
	
	@FindBy(xpath = "//a[contains(@class,'nav')][contains(.,'Solutions')]")
	@CacheLookup WebElement solutionsLink;
	
	@FindBy(xpath = "//a[contains(@class,'nav')][contains(.,'Resources')]")
	@CacheLookup WebElement resourcesLink;
	
	@FindBy(id = "cart")
	@CacheLookup WebElement cartLink;
	
	@FindBy(css = ".navbar-brand")
	@CacheLookup WebElement logo;
	
	
	
	
	
//	######################## Actions Methods ######################################

	public void clickLogo() {
	}

	public void method2() {
		driver.get("https://www.grammarly.com/signin");
	}

	public void method3() {
		System.out.println("Method3");
	}

}
