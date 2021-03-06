package com.bankguru.payment;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bankguru.pageObjects.HomePageObject;
import bankguru.pageObjects.LoginPageObject;
import bankguru.pageObjects.RegisterPageObject;
import commons.AbstractTest;
import commons.PageGeneratorManager;

public class Level_06_MultiBrowser_Parrallel_FactoryPattern extends AbstractTest {

	WebDriver driver;
	WebDriverWait explicitWait;
	String email, loginPageURL, userIDValue, passwordValue;

	private LoginPageObject loginPage;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;

	@Parameters("browser")
	@BeforeClass
	public void initData(String browserName) {
		System.out.println("Browser Name: " + browserName);
		driver = openMultiBrowser(browserName);

		explicitWait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		email = "JohnWick" + randomNumber() + "@gmail.com";
		driver.get("http://demo.guru99.com/v4/");

	}

	@Test
	public void TC_01_RegisterToSystem() {
		loginPage = PageGeneratorManager.getLoginPage(driver);
		Assert.assertTrue(loginPage.isLoginFormDisplayed());
		loginPageURL = loginPage.getLoginPageURL();
		registerPage = loginPage.clickToHereLink();
		registerPage.isRegisterPageDisplayed();
		registerPage.inputEmailIDTextbox(email);
		registerPage.clickSubmitButton();
		userIDValue = registerPage.getUserIDValue();
		passwordValue = registerPage.getPasswordValue();
	}

	@Test
	public void TC_02_LoginToSystem() {
		loginPage = registerPage.openLoginPage(loginPageURL);
		Assert.assertTrue(loginPage.isLoginFormDisplayed());
		loginPage.inputToUserIDTextbox(userIDValue);
		loginPage.inputToPasswrodTextbox(passwordValue);
		homePage = loginPage.clickToLoginButton();
		Assert.assertTrue(homePage.isWelcomeMessageDisplayed());
		loginPage = homePage.clickToLogOutLink();
		Assert.assertTrue(loginPage.isLoginFormDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999999);
	}
}
