package com.bluecloak.map;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.blueCloak.LandingPageObject;
import pageObjects.blueCloak.LoginPageObject;
import pageObjects.blueCloak.MapPageObject;
import pageObjects.blueCloak.AddProjectPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Sample_E2E_Test_Map extends BaseTest{
	private WebDriver driver;
	private LoginPageObject loginPage;
	private LandingPageObject landingPage;
	private AddProjectPageObject addProjectPage;
	private MapPageObject mapPage;	
	private int nodeX,nodeY,pgX,pgY;
  @Parameters("browser")	
  @BeforeClass
  public void beforeClass(String browserName) {
	  driver = getBrowserName(browserName);
	  loginPage = new LoginPageObject(driver);
	  landingPage = new LandingPageObject(driver);
	  addProjectPage = new AddProjectPageObject(driver);
	  mapPage = new MapPageObject(driver);
	  nodeX = 70;
	  nodeY = 50;
	  pgX = 400;
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
	  addProjectPage.inputToNameTextbox(Project_Name) ;
	  addProjectPage.inputToDescriptionTextbox("This is testing");
	  //addProjectPage.selectCategoryCheckbox();
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
      mapPage.clickToMap(nodeX,nodeY);
	  mapPage.isValidationMessageDisplay();
	  mapPage.enterToFolderTextfield("/e2e-folder-");
	  mapPage.isValidationMessageUndisplay();
	  //mapPage.getNodeNamefield();
	  mapPage.submitAddNodeForm();
  }
	
	  @Test 
	  public void BlueCloak_04_Add_PG_To_Map() 
	  {
	  mapPage.clickToPublicPortGroupBtn(); 
	  sleepInSecond(1);
	  mapPage.clickToMap(pgX,pgY); 
	  mapPage.submitAddPGForm();
	  }
  
  @Test
  public void BlueCloak_05_Add_Interface_To_Map() {
	   sleepInSecond(2);
	   mapPage.clickToMap(nodeX,nodeY);
	   sleepInSecond(1);
	   mapPage.rightClickToMap(nodeX, nodeY);
	   sleepInSecond(1);
	   mapPage.connectInterface();
	   mapPage.clickToMap(pgX,pgY);
	   mapPage.clickToAddInterfaceBtn();
	   mapPage.selectDirectionInterface(" Inbound ");
	   mapPage.selectVlanMode("Trunk");

  }

  @AfterClass
  public void afterClass() {
  }

}
