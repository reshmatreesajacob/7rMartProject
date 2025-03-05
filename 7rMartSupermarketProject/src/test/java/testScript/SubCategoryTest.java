package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {

	@Test(description = "Verify whether the user can add new item in the Sub category list using New Button")
	public void verifyWhetherUserIsAbleToaddNewItemToSubCategoryList() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		SubCategoryPage subcategory = new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();

		subcategory.clickOnNewButtonOfSubCategoryPage();
		String category = ExcelUtility.readStringData(1, 0, "SubCategoryPage");
		subcategory.selectCategoryFromSubCategoryCreationPage(category);
		String subCategory = ExcelUtility.readStringData(1, 1, "SubCategoryPage");
		subcategory.enterSubCategoryOfSubCategoryCreationPage(subCategory);
		String image = ExcelUtility.readStringData(1, 2, "SubCategoryPage");
//		subcategory.selectImageOfSubCategoryCreationPage(image);
		subcategory.selectImageOfSubCategoryCreationPage();
		subcategory.clickOnSaveButtonOfSubCategoryCreationPage();

		String expectedResult = "Alert!";
		String actualResult = subcategory.getTextFromAlert();
		Assert.assertEquals(actualResult, expectedResult, Messages.SUBCATEGORYCREATIONERROR);
	}

	@Test(description = "Verify whether the user can refresh the Sub Category list using Reset Button")
	public void verifyWhetherUserIsAbleTorefreshPageUsingResetButton() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		SubCategoryPage subcategory = new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();

		subcategory.clickOnResetButtonOfSubCategoryPage();

		String expectedResult = "List Sub Categories";
		String actualResult = subcategory.getTextFromRefreshNewsDisplayed();
		Assert.assertEquals(actualResult, expectedResult, Messages.SUBCATEGORYREFRESHPAGEERROR);
	}

	@Test(description = "Verify whether the user can search a item in the Sub Category list using Search Button")
	public void verifyWhetherUserIsAbleTosearchItemsInTheSubCategoryList() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();

		SubCategoryPage subcategory = new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();

		subcategory.clickOnSearchButtonOfSubCategoryPage();
		String category = ExcelUtility.readStringData(1, 0, "SubCategoryPage");
		subcategory.selectCategoryFromSubCategorySearchPage(category);
		String subCategory = ExcelUtility.readStringData(1, 1, "SubCategoryPage");
		subcategory.enterSubCategoryOfSubCategorySearchPage(subCategory);
		subcategory.clickOnSearchButtonOfSubCategorySearchPage();

		boolean issearchDisplayed = subcategory.isSearchSubcategoryIsDisplayed();
		Assert.assertTrue(issearchDisplayed, Messages.SUBCATEGORYSEARCHPAGEERROR);
	}

}
