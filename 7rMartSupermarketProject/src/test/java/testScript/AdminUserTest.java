package testScript;

import java.beans.Transient;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	@Test
	public void verifyWhetherUserIsAbleToAddNewUserToTheUsersList() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		AdminUserPage admin = new AdminUserPage(driver);
		admin.clickOnAdminUsersButton();
		admin.clickOnManageUsersButton();

		admin.clickOnNewButton();
		String newUsername = ExcelUtility.readStringData(2, 0, "AdminUserPage");
		String newPassword = ExcelUtility.readStringData(2, 1, "AdminUserPage");
		String newUserType = ExcelUtility.readStringData(2, 2, "AdminUserPage");
		admin.enterNewUsernameOnUsernameField(newUsername);
		admin.enterNewPasswordOnPasswordField(newPassword);
		admin.selectNewUserTypeOnUserTypeField(newUserType);
		admin.clickOnSaveButton();
	}

	@Test
	public void verifyUserIsAbleToRefreshNewlyAddedUserPageUsingTheResetButton() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		AdminUserPage admin = new AdminUserPage(driver);
		admin.clickOnAdminUsersButton();
		admin.clickOnManageUsersButton();

		admin.clickOnResetButton();
	}

	
	@Test
	public void verifyUserIsAbleToSearchNewlyAddedUsersInTheNewlyAddedUsersList() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		AdminUserPage admin = new AdminUserPage(driver);
		admin.clickOnAdminUsersButton();
		admin.clickOnManageUsersButton();

		admin.clickOnSearchButton();
		String searchUsername = ExcelUtility.readStringData(2, 4, "AdminUserPage");
		String searchUserType = ExcelUtility.readStringData(2, 5, "AdminUserPage");
		admin.enterUsernameOnUsernameFieldOfSearchPage(searchUsername);
		admin.selectUserTypeOnUserTypeFieldOfSearchPage(searchUserType);
		admin.clickOnSearchButtonInSearchPage();

	}
}
