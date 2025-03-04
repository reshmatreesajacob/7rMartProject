package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(description = "Verify whether the user can add new news in the News list using New Button")
	public void verifyWhetherUserIsAbleToAddNewNewsInManageNews() throws IOException {
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
		String expectedResult = "Alert!";
		String actualResult = manage.getTextFromAlert();
		Assert.assertEquals(actualResult, expectedResult, Messages.MANAGENEWSCREATIONERROR);
	}

	@Test(description = "Verify whether the user can search a news in the News list using Search Button")
	public void verifyWhetherUserIsAbleTosearchNewsInManageNews() throws IOException {
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

		boolean issearchDisplayed = manage.isSearchNewsIsDisplayed();
		Assert.assertTrue(issearchDisplayed, Messages.MANAGENEWSSEARCHPAGEERROR);

	}

	@Test(description = "Verify whether the user can refresh the News list using Reset Button")
	public void verifyWhetherUserIsAbleToRefreshNewsPageUsingTheResetButton() throws IOException {
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

		String expectedResult = "Manage News";
		String actualResult = manage.getTextFromRefreshNewsDisplayed();
		Assert.assertEquals(actualResult, expectedResult, Messages.MANAGENEWSREFRESHPAGEERROR);

	}

}
