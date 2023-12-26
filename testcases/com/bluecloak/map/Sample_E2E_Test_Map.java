package com.bluecloak.map;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.blueCloak.LandingPageObject;
import pageObjects.blueCloak.LoginPageObject;
import pageObjects.blueCloak.MapPageObject;
import pageObjects.blueCloak.NavigationMenuPageObject;
import pageObjects.blueCloak.AddProjectPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Sample_E2E_Test_Map extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;
	private LandingPageObject landingPage;
	private AddProjectPageObject addProjectPage;
	private MapPageObject mapPage;
	private NavigationMenuPageObject navigationBarPage;
	int nodeX, nodeY, pgX, pgY,portGroupX,portGroupY;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserName(browserName);
		loginPage = new LoginPageObject(driver);
		landingPage = new LandingPageObject(driver);
		addProjectPage = new AddProjectPageObject(driver);
		mapPage = new MapPageObject(driver);
		navigationBarPage = new NavigationMenuPageObject(driver);
		nodeX = 70;
		nodeY = 50;
		pgX = -300;
		pgY = 50;
	}

	@Test
	public void BlueCloak_01_Login_To_System() {
		loginPage.inputToUsernameTexbox("admin");
		loginPage.inputToPasswordTexbox("password");
		loginPage.clickToLoginButton();
		Assert.assertTrue(landingPage.isTitleLandingPageDisplay());
	}

	@Test
	public void BlueCloak_02_Create_Project() {
		landingPage.clickToAddNewProjectButton();
		String Project_Name = "Long Test Auto" + " " + generateRandomNumber();
		addProjectPage.inputToNameTextbox(Project_Name);
		addProjectPage.inputToDescriptionTextbox("This is testing");
		// addProjectPage.selectCategoryCheckbox();
		addProjectPage.selectOptionCheckbox();
		addProjectPage.clickToCreatebutton();
		addProjectPage.searchProject(Project_Name);
		sleepInSecond(1);
		addProjectPage.clickToProject();
	}

	@Test
	public void BlueCloak_03_Add_Node_To_Map() {
		mapPage.clickToDeviceSelectBox();
		mapPage.selectDeviceOption();
		mapPage.clickToTemplateSelectBox();
		mapPage.selectTemplateOption();
		mapPage.clickToAddNodeButton();
		mapPage.clickToMinimizeButton();
		sleepInSecond(1);
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMapZoomOutButton();
		mapPage.clickToMap(nodeX, nodeY);
		mapPage.isValidationMessageDisplay();
		mapPage.enterToFolderTextfield("/e2e-folder-");
		// mapPage.isValidationMessageUndisplay();
		String getNodeName = mapPage.getNamefield();
		System.out.println(getNodeName);
		mapPage.submitAddNodeForm();
		sleepInSecond(1);
		mapPage.clickToMap(nodeX, nodeY);
		sleepInSecond(1);
		mapPage.clickToStyleTab();
		sleepInSecond(1);
		mapPage.updateNodeSize(100,0);
		sleepInSecond(1);
		//mapPage.clickToNodesTab();
		//sleepInSecond(1);
		mapPage.clickToMaximumButton();
		sleepInSecond(1);
		mapPage.tickToNodesCheckbox(getNodeName);
	}

	@Test
	public void BlueCloak_04_Add_PG_To_Map() {
		mapPage.clickToEditTab();
		sleepInSecond(1);
		mapPage.clickToPublicPortGroupBtn();
		sleepInSecond(1);
		mapPage.clickToMinimizeButton();
		sleepInSecond(1);
		mapPage.clickToMap(pgX, pgY);
		String getPgName = mapPage.getNamefield();
		System.out.println(getPgName);
		mapPage.submitAddPGForm();
		sleepInSecond(1);
		mapPage.clickToMaximumButton();
		sleepInSecond(1);
		mapPage.clickToPortGroupTab();
		sleepInSecond(1);
		mapPage.tickToPortGroupCheckbox(getPgName);
		sleepInSecond(1);
		mapPage.clickToStyleTab();
		sleepInSecond(1);
		mapPage.updatePGSize(100,0);
	}
	
	
	public void BlueCloak_05_Add_Interface_To_Map() {
		mapPage.clickToMinimizeButton();
		sleepInSecond(1);
		mapPage.clickToMap(nodeX, nodeY);
		sleepInSecond(1);
		mapPage.rightClickToMap(nodeX, nodeY);
		mapPage.connectInterface();
		sleepInSecond(2);
		mapPage.clickToMap(pgX, pgY);
//		  sleepInSecond(1); 
//		  mapPage.clickToAddInterfaceBtn();
//		  mapPage.selectDirectionInterface(" Inbound ");
//		  mapPage.selectVlanMode("Trunk"); 
//		  mapPage.submitAddInterfaceForm();
//		  sleepInSecond(1);
//		  mapPage.clickToConnectButton(); 
//		  sleepInSecond(1);
//		  mapPage.clickToSaveButton();
//		  mapPage.refreshCurrentPage(driver);
//		  sleepInSecond(2);
//		  mapPage.clickToMapZoomButton();
	}
	
	 @Test
	 private void BlueCloak_06_Delete_Project() {
		 navigationBarPage.clickToProjectMenu();
		 sleepInSecond(1);
		 navigationBarPage.clickToDeleteProjectButton();
		 sleepInSecond(1);
		 navigationBarPage.clickToConfirmDeleteButon();
	}

	@AfterClass
	public void afterClass() {
	}

}
