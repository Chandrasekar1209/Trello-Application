package trello.testcases;


import org.testng.annotations.Test;

import trello.base.TestBase;

public class CreationOfTrelloBoardAndListTest extends TestBase {
	String boardTitle="AutomationBoard 02";
	
	@Test
	public void testTrelloApplication() {

		login.loginToTrello("mchandrasekar233@gmail.com","Welcome@123");
		dashBoard.creationOfBoard(boardTitle);
		yourBoards.creationOfCards(boardTitle,"List A","List B","Card Content for List A");
		yourBoards.checkDragAndDropAndXYCoordinates();
		dashBoard.logOut();

	}





}
