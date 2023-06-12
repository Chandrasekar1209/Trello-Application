package trello.testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class demoScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20000));

		driver.get("https://trello.com/login");
		System.out.println(driver.getTitle());

		WebElement emailTextBox=driver.findElement(By.id("user"));
		emailTextBox.sendKeys("mchandrasekar233@gmail.com");

		WebElement continueButton=driver.findElement(By.id("login"));
		continueButton.click();

		Thread.sleep(3000);

		WebElement passwordTextBox=driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("Welcome@123");

		WebElement loginButton=driver.findElement(By.id("login-submit"));
		loginButton.click();

		Thread.sleep(7000);
		//		
		//		WebElement checkProfileName=driver.findElement(By.xpath("//span[@title='Chandrasekar (mchandrasekar233)']"));
		//		System.out.println(checkProfileName.getText());
		//		assertEquals(checkProfileName.getText(), "Chandrasekar (mchandrasekar233)");


		WebElement createButton=driver.findElement(By.xpath("//button[@data-testid='header-create-menu-button']"));
		createButton.click();

		WebElement createBoard=driver.findElement(By.xpath("//button[@data-testid='header-create-board-button']"));
		createBoard.click();

		WebElement boardTitleTextbox=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		String boardTitle="Automation Board 01";
		boardTitleTextbox.sendKeys(boardTitle);

		Thread.sleep(5000);

		WebElement createnewBoard=driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
		createnewBoard.click();

		WebElement boardNameChecking=driver.findElement(By.xpath("//h1[@data-testid='board-name-display']"));	
		assertEquals(boardNameChecking.getText(),boardTitle);

		WebElement listTitleTextBox1=driver.findElement(By.xpath("//input[@name='name']"));
		listTitleTextBox1.sendKeys("List A");

		WebElement addListButton1=driver.findElement(By.xpath("//input[@type='submit']"));
		addListButton1.click();
		System.out.println("Hi");

		Thread.sleep(4000);
		WebElement listTitleTextBox2=driver.findElement(By.xpath("//input[@class='list-name-input']"));
		listTitleTextBox2.sendKeys("List B");

		WebElement addListButton2=driver.findElement(By.xpath("//input[@type='submit']"));
		addListButton2.click();
		System.out.println("Hello");

		Thread.sleep(3000);

		WebElement addACardForListA=driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[1]"));
		addACardForListA.click();

		WebElement titleContentTextBox=driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"));
		titleContentTextBox.sendKeys("card of list a");


		WebElement addCardButton=driver.findElement(By.xpath("//input[@value='Add card']"));
		addCardButton.click();


		WebElement closeButton=driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']"));
		closeButton.click();

		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		WebElement to=driver.findElement(By.xpath("(//div[@class='list-cards u-fancy-scrollbar js-list-cards js-sortable ui-sortable'])[2]"));

		Actions actions=new Actions(driver);

		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();



		int getX = to.getLocation().getX(); 
		System.out.println("X coordinate: " +getX); 
		int getY = to.getLocation().getY(); 
		System.out.println("Y coordinate: "  +getY); 

		Thread.sleep(3000);
		WebElement userProfileButton=driver.findElement(By.xpath("//button[@data-testid='header-member-menu-button']"));
		userProfileButton.click();


		Thread.sleep(3000);
		WebElement logOutButton=driver.findElement(By.xpath("//button[@data-testid='account-menu-logout']"));
		logOutButton.click();




		//		actions.dragAndDrop(from, to).build().perform();










	}

}
