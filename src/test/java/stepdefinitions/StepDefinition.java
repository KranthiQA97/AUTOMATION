package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDefinition extends WebDriverManager{
	
	public static WebDriver driver;
	LoginPage lp;
	LoginPage gp;
	
	@Given("^user should be in login page$")
    public void user_should_be_in_login_page()  {
		StepDefinition sd = new StepDefinition();
		driver = sd.getDiver();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		lp.method1();
        System.out.println("Normal Feature");
    }

    @When("^userid and password should be given$")
    public void userid_and_password_should_be_given()  {
    	lp.method3();
    	System.out.println("Normal Feature");
    }

    @Then("^click on login button$")
    public void click_on_login_button()  {
    	lp.method3();
    	System.out.println("Normal Feature");
    }
    
    @Given("^user navigated to login page$")
    public void user_navigated_to_login_page()  {
    	gp = new LoginPage(driver);
    	gp.method1();
    	System.out.println("Sample Feature");
    }

    @When("^user have to enter valid email and password$")
    public void user_have_to_enter_valid_email_and_password()  {
    	gp.method2();
    	System.out.println("Sample Feature");
    }

    @Then("^user have to click on login button$")
    public void user_have_to_click_on_login_button()  {
    	gp.method2();
    	System.out.println("Sample Feature");
    }

}
