package trello.pageObjects;

import org.openqa.selenium.By;

public interface YourBoardsPageObjects {

	public By boardNameChecking=By.xpath("//h1[@data-testid='board-name-display']");
	public By listTitleTextBox1=By.xpath("//input[@name='name']");
	public By addListButton1=By.xpath("//input[@type='submit']");
	public By listTitleTextBox2=By.xpath("//input[@class='list-name-input']");
	public By addListButton2=By.xpath("//input[@type='submit']");
	
	
	public By addACardForListA=By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[1]");
	public By titleContentTextBox=By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']");
	public By addCardButton=By.xpath("//input[@value='Add card']");
	public By closeButton=By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']");
	
	public By fromListA=By.xpath("//span[@class='list-card-title js-card-name']");
	public By toListB=By.xpath("(//div[@class='list-cards u-fancy-scrollbar js-list-cards js-sortable ui-sortable'])[2]");
	
	
	
	
	
}
