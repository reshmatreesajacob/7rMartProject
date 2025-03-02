package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
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
		
		driver.findElement(By.xpath("//p[text()='Sub Category']")).click();
		
		driver.findElement(By.xpath("//a[text()=' New']")).click();
		WebElement category=driver.findElement(By.xpath("//select[@id='cat_id']"));
		Select select=new Select(category);
		select.selectByContainsVisibleText("Toys");

		driver.findElement(By.xpath("//input[@id='subcategory']")).sendKeys("Sports Toy Car");
		
		driver.findElement(By.xpath("//input[@id='main_img']"))
			  .sendKeys("C:\\Users\\RESHMA\\git\\7rmart_Supermarket_Project\\7rMartSupermarketProject\\src\\test\\resources\\sports Toy car.jpg");
		
		driver.findElement(By.xpath("//button[@name='create']")).click();
		
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
		
		driver.findElement(By.xpath("//p[text()='Sub Category']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Reset']")).click();
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
		
		driver.findElement(By.xpath("//p[text()='Sub Category']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		WebElement category=driver.findElement(By.xpath("//select[@id='un']"));
		Select select=new Select(category);
		select.selectByContainsVisibleText("Toys");
		
		driver.findElement(By.xpath("//input[@name='ut']")).sendKeys("Sports");
		
		driver.findElement(By.xpath("//button[@name='Search']")).click();
	}

}
