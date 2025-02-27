package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;

public class HomeTest extends Base 
{
	@Test(description = "Verification of user can use the Logout functionality ")
	public void verifyUserLogoutFromPage()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		WebElement adminDropDown=driver.findElement(By.xpath("//img[@class='img-circle']"));
		adminDropDown.click();
		WebElement logoutButton=driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		logoutButton.click();
}
}
