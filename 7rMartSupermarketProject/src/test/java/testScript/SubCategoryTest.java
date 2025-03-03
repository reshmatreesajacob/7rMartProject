package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base
{
	
	@Test
	public void addNewItemToSubCategoryList() throws IOException
	{
		
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();
		
		subcategory.clickOnNewButtonOfSubCategoryPage();
		String category=ExcelUtility.readStringData(1, 0, "SubCategoryPage");
		subcategory.selectCategoryFromSubCategoryCreationPage(category);
		String subCategory=ExcelUtility.readStringData(1, 1, "SubCategoryPage");
		subcategory.enterSubCategoryOfSubCategoryCreationPage(subCategory);
		String image=ExcelUtility.readStringData(1, 2, "SubCategoryPage");
		subcategory.selectImageOfSubCategoryCreationPage(image);
		subcategory.clickOnSaveButtonOfSubCategoryCreationPage();
	}
	
	@Test
	public void refreshPageUsingResetButton() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();
		
		subcategory.clickOnResetButtonOfSubCategoryPage();
	}
	
	@Test
	public void searchItemsInTheSubCategoryList() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.clickOnSubCategoryButton();
		
		subcategory.clickOnSearchButtonOfSubCategoryPage();
		String category=ExcelUtility.readStringData(1, 0, "SubCategoryPage");
		subcategory.selectCategoryFromSubCategorySearchPage(category);
		String subCategory=ExcelUtility.readStringData(1, 0, "SubCategoryPage");
		subcategory.enterSubCategoryOfSubCategorySearchPage(subCategory);
		subcategory.clickOnSearchButtonOfSubCategorySearchPage();
	}

}
