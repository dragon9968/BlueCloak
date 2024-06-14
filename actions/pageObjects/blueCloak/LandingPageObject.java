package pageObjects.blueCloak;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.blueCloak.LandingPageUI;

public class LandingPageObject extends BasePage{
	private WebDriver driver;
	public LandingPageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Verify Title of Landing Page is displayed")
	public boolean isTitleLandingPageDisplay() {
		waitForElementVisible(driver, LandingPageUI.LANDING_TITLE);
		return isElementDisplayed(driver, LandingPageUI.LANDING_TITLE);
		
	}
	
	public void clickToAddNewProjectButton() {
		waitingLoadingIcon(driver);
		waitForElementClickable(driver, LandingPageUI.ADD_NEW_PROJECT_BTN);
		clickToElement(driver, LandingPageUI.ADD_NEW_PROJECT_BTN);
		waitingLoadingIcon(driver);
		//return PageGeneratorManager.getHomePage(driver);
		
	}
	
	/*
	 * public void waitingLoadingIcon() { overrideImplicitTimeout(driver, 1);
	 * getWebElement(driver, LandingPageUI.LOADING_ICON);
	 * waitForElementInvisible(driver, LandingPageUI.LOADING_ICON);
	 * 
	 * }
	 */
	
}
