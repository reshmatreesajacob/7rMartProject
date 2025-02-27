package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.Base;

public class LoginTest extends Base
{
	@Test(priority = 1,description = "Verification of user login with valid Credentials")
	public void verifyUserLoginWithValidUsernameAndValidPassword() 
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();	
	}
	
	@Test(priority = 2,description = "Verification of user login with valid username and invalid password")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() 
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("ad");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();	
	}
	
	@Test(priority = 3,description = "Verification of user login with invalid username and valid password")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() 
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Test");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();	
	}
	
	@Test(priority = 4,description = "Verification of user login with invalid username and invalid password")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() 
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("ad");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("ad");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();	
	}

}
