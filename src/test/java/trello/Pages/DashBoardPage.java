package trello.Pages;

import org.openqa.selenium.WebDriver;

import trello.base.BasePage;
import trello.pageObjects.DashBoardPageObjects;

public class DashBoardPage extends BasePage  implements  DashBoardPageObjects{

	public DashBoardPage(WebDriver ldriver) {
		super(ldriver);
	}
	
	
	public void creationOfBoard(String boardTitle) {
		try {
			clickableMethod(createButton);
			clickableMethod(createBoard);
			sendKeysMethod(boardTitleTextbox, boardTitle);
			Thread.sleep(5000);
			clickableMethod(createnewBoardButton);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void logOut() {
		try {
			clickableMethod(userProfileButton);
			Thread.sleep(3000);
			clickableMethod(logOutButton);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	
	
}
