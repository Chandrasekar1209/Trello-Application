package trello.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;



import trello.Pages.DashBoardPage;
import trello.Pages.LoginPage;
import trello.Pages.YourBoardsPage;
import trello.browserFactory.BrowserFactory;
import trello.configDataProvider.ConfigDataProvider;



public class TestBase {

	public static WebDriver driver = null;
	protected LoginPage login = null;
	protected DashBoardPage dashBoard = null;
	protected YourBoardsPage yourBoards = null;
	protected ConfigDataProvider config;
	
	@BeforeSuite(alwaysRun = true)
	public void setupSuite() {
		
		config=new ConfigDataProvider();
		
		}
	
	@BeforeClass(alwaysRun = true)
	public void setup() throws InterruptedException {
		driver=BrowserFactory.startApplication(driver,config.getBrowser(), config.getURL());
		login=new LoginPage(driver);
		dashBoard=new DashBoardPage(driver);
		yourBoards=new YourBoardsPage(driver);
		
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDownSuiteLevel() {
		driver.quit();
	}
	
}
