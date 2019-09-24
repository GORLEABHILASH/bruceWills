package brucewills.vindiesel;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Test {
	static WebDriver driver;
	public static WebDriver openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.getProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Drivers\\chromeDriver.exe");
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			File file = new File("webdriver.ie.driver","IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			 driver = new InternetExplorerDriver();
			
			
		}
		else {
			System.out.println("Invalid browser");
			return driver;
		}
		return driver;

	
	}

}
