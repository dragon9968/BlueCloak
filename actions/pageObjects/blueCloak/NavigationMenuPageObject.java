package pageObjects.blueCloak;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.blueCloak.NavigationBarUI;

public class NavigationMenuPageObject extends BasePage {
	private WebDriver driver;
	public NavigationMenuPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToProjectMenu() {
		waitForElementClickable(driver, NavigationBarUI.PROJECT_MENU);
		clickToElement(driver, NavigationBarUI.PROJECT_MENU);
	}
	public void clickToDeleteProjectButton() {
		waitForElementClickable(driver, NavigationBarUI.DELETE_PROJECT);
		clickToElement(driver, NavigationBarUI.DELETE_PROJECT);
	}
	public void clickToConfirmDeleteButon() {
		waitForElementClickable(driver, NavigationBarUI.CONFIRM_DELETE);
		clickToElement(driver, NavigationBarUI.CONFIRM_DELETE);
	}
}
