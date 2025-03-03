package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test
	public void createNewNewsInManageNews() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnManageNewsButton();
		manage.clickOnNewButtonOfManageNewsPage();
		String news = ExcelUtility.readStringData(1, 0, "ManageNewsPage");
		manage.enterNewNewsOnNewsField(news);
		manage.clickOnSaveButtonOfNewNewsCreationpage();
		String expectedResult="Alert!";
		String actualResult=manage.getTextFromAlert();
		Assert.assertEquals(actualResult,expectedResult,"User was unable to create new news!");
	}

	
	@Test
	public void searchNewsInManageNews() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnManageNewsButton();
		manage.clickOnSearchButtonOfManageNewsPage();
		String news = ExcelUtility.readStringData(1, 2, "ManageNewsPage");
		manage.enterSearchNewsOnSearchNewsField(news);
		manage.clickOnSearchButtonOfSearchNewsPage();
	}

	@Test
	public void refreshPageUsingTheResetButton() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		ManageNewsPage manage = new ManageNewsPage(driver);
		manage.clickOnManageNewsButton();
		manage.clickOnResetButtonOfManageNewsPage();
	}

}
