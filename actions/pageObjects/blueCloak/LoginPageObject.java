package pageObjects.blueCloak;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.blueCloak.LoginPageUI;

public class LoginPageObject extends BasePage{
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	@Step("Input to UserName textbox with value is {0}")
	public void inputToUsernameTexbox(String Email) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, Email);
	}
	
	@Step("Input to Password textbox with value is {0}")
	public void inputToPasswordTexbox(String Password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, Password);
	}
	
	@Step("Click to Login button")
	public void clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		//return PageGeneratorManager.getHomePage(driver);
	}
}
