package trello.pageObjects;

import org.openqa.selenium.By;

public interface DashBoardPageObjects {

	public By createButton=By.xpath("//button[@data-testid='header-create-menu-button']");
	public By createBoard=By.xpath("//button[@data-testid='header-create-board-button']");
	public By boardTitleTextbox=By.xpath("//input[@data-testid='create-board-title-input']");
	public By createnewBoardButton=By.xpath("//button[@data-testid='create-board-submit-button']");
	public By userProfileButton=By.xpath("//button[@data-testid='header-member-menu-button']");
	public By logOutButton=By.xpath("//button[@data-testid='account-menu-logout']");
	
	
}
