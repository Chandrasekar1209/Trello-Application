package trello.Pages;

import org.openqa.selenium.WebDriver;

import trello.base.BasePage;
import trello.pageObjects.YourBoardsPageObjects;

public class YourBoardsPage extends BasePage  implements YourBoardsPageObjects{

	
	public YourBoardsPage(WebDriver ldriver) {
		super(ldriver);
	}
	
	public void creationOfCards(String boardTitle,String listAHeading,String listBHeading,String cardContent) {
		try {
			assertEqualsForCompareTwoStrings(driver, boardNameChecking,boardTitle);
			sendKeysMethod(listTitleTextBox1,listAHeading);
			clickableMethod(addListButton1);
			Thread.sleep(4000);
			sendKeysMethod(listTitleTextBox2,listBHeading);
			clickableMethod(addListButton2);
			Thread.sleep(3000);
			clickableMethod(addACardForListA);
			sendKeysMethod(titleContentTextBox, cardContent);
			clickableMethod(addCardButton);
			clickableMethod(closeButton);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void checkDragAndDropAndXYCoordinates() {
		try {
			actionDragAndDrop(driver,fromListA , toListB);
			getXYCoordinates(driver, toListB);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
