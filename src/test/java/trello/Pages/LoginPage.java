package trello.Pages;

import org.openqa.selenium.WebDriver;

import trello.base.BasePage;
import trello.pageObjects.LoginPageObjects;

public class LoginPage extends BasePage  implements LoginPageObjects  {

	
	
	//Constructor for initializing the driver
	public LoginPage(WebDriver ldriver) {
			super(ldriver);
		}
	
	
		public void loginToTrello(String email,String password) {
			
			try {
				sendKeysMethod(emailTextBox,email);
				clickableMethod(continueButton);
				Thread.sleep(3000);
				sendKeysMethod(passwordTextBox, password);
				clickableMethod(loginButton);
				Thread.sleep(7000);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
		}
	
	
}
