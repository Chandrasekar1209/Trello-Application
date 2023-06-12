package trello.browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import trello.constant.Constant;



public class BrowserFactory {


	//******Loading Browser **********//

	public static WebDriver startApplication(WebDriver driver,String browser,String url) throws InterruptedException {

		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",Constant.chrome_driverLocation);
			driver=new ChromeDriver();

		}else  if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Constant.gecko_driverLocation);
			driver=new FirefoxDriver();
		}else {
			Assert.assertTrue(false,"NO BROWSER IS LAUNCHED, SEND A PROPER BROWSER NAME");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constant.wait_secounds);
		driver.manage().timeouts().pageLoadTimeout(Constant.wait_secounds);
		driver.get(url);
		return driver;
	}
	//*****Closing Browser*****//
	public static void quitBrowser(WebDriver driver) {
		driver.close();
	}


       
}
