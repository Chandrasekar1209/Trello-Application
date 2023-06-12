package trello.testcases;


import org.testng.annotations.Test;

import trello.base.TestBase;

public class CreationOfTrelloBoardAndListTest extends TestBase {
	
	
	@Test
	public void testTrelloApplication() {

		login.loginToTrello(config.getEmailAddress(),config.getPassword());
		dashBoard.creationOfBoard(config.getBoardTtile());
		yourBoards.creationOfCards(config.getBoardTtile(),config.getListATitle(),config.getListBTitle(),config.getCardContent());
		yourBoards.checkDragAndDropAndXYCoordinates();
		dashBoard.logOut();
	}





}
