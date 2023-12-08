package pageObjects.blueCloak;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.blueCloak.AddProjectPageUI;

public class AddProjectPageObject extends BasePage{
	private WebDriver driver;

	public AddProjectPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputToNameTextbox(String Name) {
		waitForElementVisible(driver, AddProjectPageUI.NAME);
		sendkeyToElement(driver, AddProjectPageUI.NAME, Name);
    	//waitingLoadingIcon(driver);

	}
	public void inputToDescriptionTextbox(String Description) {
		waitForElementVisible(driver, AddProjectPageUI.DESCRIPTION);
		sendkeyToElement(driver, AddProjectPageUI.DESCRIPTION, Description);

	}

	/*
	 * public void selectCategoryCheckbox() { waitingLoadingIcon(driver);
	 * waitForElementVisible(driver, AddProjectPageUI.CATEGORY);
	 * checkToDefaultCheckboxRadio(driver, AddProjectPageUI.CATEGORY); }
	 */
	public void selectTargerDropdownlist(String Target) {
		
	}
	public void selectOptionCheckbox() {
		//waitingLoadingIcon(driver);
		waitForElementClickable(driver, AddProjectPageUI.OPTION);
		clickToElement(driver, AddProjectPageUI.OPTION);
	}
	public void clickToCreatebutton() {
		scrollToBottomPage(driver);
		waitForElementClickable(driver, AddProjectPageUI.CREATE_BUTTON);
		clickToElement(driver, AddProjectPageUI.CREATE_BUTTON);
    	waitingLoadingIcon(driver);

	}
	
    public void clickToProject() {
    	waitForElementClickable(driver, AddProjectPageUI.PROJECT_NAME);
		doubleClickToElement(driver, AddProjectPageUI.PROJECT_NAME);
    	waitingLoadingIcon(driver);
	}
    public void searchProject(String ProjectName) {
		waitForElementVisible(driver, AddProjectPageUI.SEARCH_TEXTBOX);
		sendkeyToElement(driver, AddProjectPageUI.SEARCH_TEXTBOX,ProjectName);
		
	}

}
