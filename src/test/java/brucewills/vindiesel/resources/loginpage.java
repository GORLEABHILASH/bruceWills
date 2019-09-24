package brucewills.vindiesel.resources;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	@FindBy(how=How.LINK_TEXT,using="SignIn")
	static public WebElement signin;
	@FindBy(how=How.NAME,using="userName")
	static public WebElement username;
	@FindBy(how=How.ID,using="password")
	static public WebElement password1;
	@FindBy(how=How.NAME,using="Login")
	static public WebElement login1;
	@FindBy(how=How.LINK_TEXT,using="SignOut")
	static public WebElement signout1;
	

}
