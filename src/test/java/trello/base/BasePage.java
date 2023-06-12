package trello.base;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import trello.constant.Constant;



public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	//******* WEBDRIVER INITIALIZATION *********//
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//******* FIND ELEMENT METHOD ***********//
	public void  findElementMethod(By locator)   {
		try {
			driver.findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********* WAIT FOR VISIBILITY OF ELEMENTS TO BE LOCATED ************//
	public void waitForVisibilityOfElementLocated(WebDriver driver, By locators) {
		try {
			wait = new WebDriverWait(driver,Constant.wait_secounds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	//******* CLICK ELEMENT METHOD **********//
	public void clickableMethod(By locator){

		try {
			waitForElementToBeClickable(driver, locator);
			WebElement element=driver.findElement(locator);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********* SEND KEYS METHOD **************//
	public void sendKeysMethod(By locator,String string){
		try {
			WebElement element=driver.findElement(locator);
			element.sendKeys(string);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//********* ACTION DRAG AND DROP METHOD ***************//
	public void actionDragAndDrop(WebDriver driver,By fromLocator,By toLocator) {
		try {
			WebElement fromElement=driver.findElement(fromLocator);
			WebElement toElement=driver.findElement(toLocator);
			Actions action = new Actions(driver);
			action.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********* GET XY COORDINATES METHOD ***************//
	public void getXYCoordinates(WebDriver driver,By locator) {
		try {

			WebElement element=driver.findElement(locator);
			//	Actions action = new Actions(driver);
			int getX = element.getLocation().getX(); 
			System.out.println("X coordinate: " +getX); 
			int getY = element.getLocation().getY(); 
			System.out.println("Y coordinate: "  +getY); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//******* ASSERT EQUALS - COMPARE TWO STRINGS *********//
	public void assertEqualsForCompareTwoStrings(WebDriver driver,By locator,String comparingString){
		try {
			WebElement element=driver.findElement(locator);
			assertEquals(element.getText().trim(), comparingString,"The Two Strings are not equal");
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	//********* WAIT FOR ELEMENT TO BE CLCICKABLE ****************//
	public void waitForElementToBeClickable(WebDriver driver, By locators)  {
		try {
			wait = new WebDriverWait(driver,Constant.wait_secounds);
			wait.until(ExpectedConditions.elementToBeClickable(locators));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}





}








