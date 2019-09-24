package brucewills.vindiesel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import brucewills.vindiesel.resources.loginpage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class stepdefinition {
	WebDriver driver;
	@Before
	public void beforeTest() {
		
		driver=Test.openBrowser("chrome");
		PageFactory.initElements(driver, loginpage.class);
	
		
	}
	@Given("open the url")
	public void open_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@And("click sign in")
	public void click_sign_in() {
		//driver.findElement(By.linkText("SignIn")).click();
		loginpage.signin.click();
	}
	@And("Enter {word}")
	public void Enter_username(String username) {
		//driver.findElement(By.name("userName")).sendKeys(username);
		loginpage.username.sendKeys(username);
		
	}
	@And("Enter2 {word}")
	public void Enter_password(String password) {
		//driver.findElement(By.id("password")).sendKeys(password);
		loginpage.password1.sendKeys(password);
		
	}
	@And("press login")
	public void press_login() {
		//driver.findElement(By.name("Login")).click();
		loginpage.login1.click();
	}
	@Then("press SignOut")
	public void press_signout() {
		//driver.findElement(By.linkText("SignOut")).click();
		loginpage.signout1.click();
		
	}


}


