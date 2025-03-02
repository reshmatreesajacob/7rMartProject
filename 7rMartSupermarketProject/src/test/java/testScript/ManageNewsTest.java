package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base
{ 
	@Test
	public void createNewNewsInManageNews() throws IOException 
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		ManageNewsPage manage=new ManageNewsPage(driver);
		manage.clickOnManageNewsButton();
		manage.clickOnNewButtonOfManageNewsPage();
		String news=ExcelUtility.readStringData(1, 0, "ManageNewsPage");
		manage.enterNewNewsOnNewsField(news);
		manage.clickOnSaveButtonOfNewNewsCreationpage();
	}
	
	@Test
	public void searchNewsInManageNews() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		WebElement adminUser=driver.findElement(By.xpath("//p[text()='Admin Users']"));
		adminUser.click();
		WebElement managenews=driver.findElement(By.xpath("//p[text()='Manage News']"));
		managenews.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//input[@name='un']")).sendKeys("offer");
		driver.findElement(By.xpath("//button[@name='Search']")).click();
	}
	
	@Test
	public void refreshPageUsingTheResetButton() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnSignInButton();
		
		WebElement adminUser=driver.findElement(By.xpath("//p[text()='Admin Users']"));
		adminUser.click();
		WebElement managenews=driver.findElement(By.xpath("//p[text()='Manage News']"));
		managenews.click();
		
		driver.findElement(By.xpath("//a[text()=' Reset']")).click();
	}
	

}
