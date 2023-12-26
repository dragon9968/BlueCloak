package pageObjects.blueCloak;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUIs.blueCloak.LandingPageUI;
import pageUIs.blueCloak.MapPageUI;

public class MapPageObject extends BasePage{
	private WebDriver driver;
	public MapPageObject(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clickToDeviceSelectBox() {
		waitForElementClickable(driver, MapPageUI.DEVICE_SELECTBOX);
		clickToElement(driver, MapPageUI.DEVICE_SELECTBOX);
	}
	
	public void selectDeviceOption() {
		waitForElementClickable(driver, MapPageUI.DEVICE_OPTION);
		clickToElement(driver, MapPageUI.DEVICE_OPTION);
	}
	
	public void clickToTemplateSelectBox() {
		waitForElementClickable(driver, MapPageUI.TEMPLATE_SELECTBOX);
		clickToElement(driver, MapPageUI.TEMPLATE_SELECTBOX);
	}
	
	public void selectTemplateOption() {
		waitForElementClickable(driver, MapPageUI.TEMPLATE_OPTION);
		clickToElement(driver, MapPageUI.TEMPLATE_OPTION);
	}
	
	public void clickToAddNodeButton() {
		waitForElementClickable(driver, MapPageUI.ADD_NODE_BUTTON);
		clickToElement(driver, MapPageUI.ADD_NODE_BUTTON);
	}
	
	public void clickToMinimizeButton() {
		waitForElementClickable(driver, MapPageUI.MINIMIZE_BTN);
		clickToElement(driver, MapPageUI.MINIMIZE_BTN);
	}
	public void clickToMaximumButton() {
		waitForElementClickable(driver, MapPageUI.MAXIMUM_BTN);
		clickToElement(driver, MapPageUI.MAXIMUM_BTN);
	}
	
	public void clickToMap(int X, int Y) {
		waitForElementClickable(driver, MapPageUI.MAP);
		clickToCoordinates(driver, MapPageUI.MAP, X, Y);
	}

	
	public void rightClickToMap(int X, int Y) {
		waitForElementClickable(driver, MapPageUI.MAP);
		rightClickToElement(driver, MapPageUI.MAP,X, Y);
	}
	
	public void clickAndHold(int X, int Y) {
		waitForElementClickable(driver, MapPageUI.MAP);
		clickAndHoldToElement(driver, MapPageUI.MAP);
	}
	
	public void connectInterface() {
		isElementUndisplayed(driver, MapPageUI.NODE_CONTEXT_MENU);
		clickToElement(driver, MapPageUI.NODE_CONTEXT_MENU);
		isElementUndisplayed(driver, MapPageUI.CONNECT_INTERFACE);
		clickToElement(driver, MapPageUI.CONNECT_INTERFACE);
		waitingLoadingIcon(driver);

	}
	

	public String getNamefield() { 
     waitForElementVisible(driver,
	 MapPageUI.NAME_TEXTFIELD);
	 return getElementAttributeValue(driver,MapPageUI.NAME_TEXTFIELD, "value"); 
	}
	
	public void enterToFolderTextfield(String folder) {
		waitForAllElementVisible(driver, MapPageUI.FOLDER_TEXTFIELD);
		String nodeName = getElementAttributeValue(driver, MapPageUI.NAME_TEXTFIELD, "value");
		sendkeyToElement(driver, MapPageUI.FOLDER_TEXTFIELD,folder + nodeName);
	}
	
	public void submitAddNodeForm() {
		waitForElementVisible(driver, MapPageUI.ADD_NODE_FORM);
		submitForm(driver, MapPageUI.ADD_NODE_FORM);
		waitingLoadingIcon(driver);
		
	}
	
	public void clickToStyleTab() {
		waitForElementClickable(driver, MapPageUI.MAP_STYLE_TAB);
		clickToElement(driver, MapPageUI.MAP_STYLE_TAB);	
	}
	public void clickToEditTab() {
		waitForElementClickable(driver, MapPageUI.MAP_EDIT_TAB);
		clickToElement(driver, MapPageUI.MAP_EDIT_TAB);	
	}
	
	public void updateNodeSize(int X, int Y) {
		waitForElementVisible(driver, MapPageUI.NODE_SIZE);
		dragAndDropBy(driver, MapPageUI.NODE_SIZE, X, Y);	
	}
	public void updatePGSize(int X, int Y) {
		waitForElementVisible(driver, MapPageUI.PORT_GROUP_SIZE);
		dragAndDropBy(driver, MapPageUI.PORT_GROUP_SIZE,X, Y);	
	}
	
	public void clickToPortGroupTab() {
		waitForElementClickable(driver, MapPageUI.PORT_GROUP_TAB);
		clickToElement(driver, MapPageUI.PORT_GROUP_TAB);	
	}
	
	public void clickToNodesTab() {
		waitForElementClickable(driver, MapPageUI.NODE_TAB);
		clickToElement(driver, MapPageUI.NODE_TAB);
		
	}
	
	public void tickToPortGroupCheckbox(String PortGroup_Name) {
		waitForElementClickable(driver, MapPageUI.RECORD_CHK,PortGroup_Name);
		clickToElement(driver, MapPageUI.RECORD_CHK,PortGroup_Name);
		
	}
	public void tickToNodesCheckbox(String Node_Name) {
		waitForElementClickable(driver, MapPageUI.RECORD_CHK,Node_Name);
		clickToElement(driver, MapPageUI.RECORD_CHK,Node_Name);
		
	}
	
	public void clickToPublicPortGroupBtn() {
		waitForElementClickable(driver, MapPageUI.PUBLIC_PORTGROUP);
		clickToElement(driver, MapPageUI.PUBLIC_PORTGROUP);
	}
	public void clickToPrivatePortGroupBtn() {
		waitForElementClickable(driver, MapPageUI.PRIVATE_PORTGROUP);
		clickToElement(driver, MapPageUI.PRIVATE_PORTGROUP);
	}
	
	public void submitAddPGForm() {
		waitForElementVisible(driver, MapPageUI.ADD_PORTGROUP_FORM);
		submitForm(driver, MapPageUI.ADD_PORTGROUP_FORM);
		waitingLoadingIcon(driver);	
	}
	
	public void clickToAddInterfaceBtn() {
		waitForElementClickable(driver, MapPageUI.ADD_INTERFACE_BUTTON);
		clickToElement(driver, MapPageUI.ADD_INTERFACE_BUTTON);
	}
	
	public void selectDirectionInterface(String DIRECTION_ID) {
		waitForElementClickable(driver, MapPageUI.DIRECTION_TEXTFIELD);
		clickToElement(driver, MapPageUI.DIRECTION_TEXTFIELD);
		waitForElementClickable(driver, MapPageUI.DIRECTION_VALUE,DIRECTION_ID);
		clickToElement(driver, MapPageUI.DIRECTION_VALUE,DIRECTION_ID);
	}
	
	public void selectVlanMode (String VLANMODE_ID) {
        waitForElementClickable(driver, MapPageUI.VLANMODE_TEXTFIELD);
        clickToElement(driver, MapPageUI.VLANMODE_TEXTFIELD);
        waitForElementClickable(driver, MapPageUI.VLANMODE_VALUE,VLANMODE_ID);
        clickToElement(driver, MapPageUI.VLANMODE_VALUE, VLANMODE_ID);
	}
	
	public void submitAddInterfaceForm() {
		waitForElementVisible(driver, MapPageUI.ADD_INTERFACE_FORM);
		submitForm(driver, MapPageUI.ADD_INTERFACE_FORM);
		waitingLoadingIcon(driver);	
	}
	
	public void clickToConnectButton() {
		waitForElementClickable(driver, MapPageUI.CONNECT_BTN);
		clickToElement(driver, MapPageUI.CONNECT_BTN);
		waitingLoadingIcon(driver);	
		
	}
	public void clickToMapZoomButton() {
		waitForElementClickable(driver, MapPageUI.MAP_ZOOM_DEFAULT);
		clickToElement(driver, MapPageUI.MAP_ZOOM_DEFAULT);
	}
	
	public void clickToMapZoomOutButton() {
		waitForElementClickable(driver, MapPageUI.MAP_ZOOM_OUT);
		clickToElement(driver, MapPageUI.MAP_ZOOM_OUT);
	}
	
	public void clickToSaveButton() {
		waitForElementClickable(driver, MapPageUI.MAP_SAVE_BUTTON);
		clickToElement(driver, MapPageUI.MAP_SAVE_BUTTON);
		waitingLoadingIcon(driver);	

	}
	
	public boolean isValidationMessageDisplay() {
		waitForElementVisible(driver, MapPageUI.VALIDATION_ERROR);
		return isElementDisplayed(driver, MapPageUI.VALIDATION_ERROR);		
	}
	
	public boolean isValidationMessageUndisplay() {
		waitForElementInvisible(driver, MapPageUI.VALIDATION_ERROR);
		return isElementUndisplayed(driver, MapPageUI.VALIDATION_ERROR);		
	}
	
	
}
