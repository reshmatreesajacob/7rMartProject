package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.Base;

public class ManageNewsTest extends Base
{ 
	@Test
	public void createNewNewsInManageNews() 
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
		WebElement adminUser=driver.findElement(By.xpath("//p[text()='Admin Users']"));
		adminUser.click();
		WebElement managenews=driver.findElement(By.xpath("//p[text()='Manage News']"));
		managenews.click();

		WebElement create=driver.findElement(By.xpath("//a[text()=' New']"));
		create.click();
		WebElement text=driver.findElement(By.xpath("//textarea[@id='news']"));
		text.sendKeys("25% Discount on all garments");
		WebElement save=driver.findElement(By.xpath("//button[@name='create']"));
		save.click();
	}
	
	@Test
	public void searchNewsInManageNews()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
		WebElement adminUser=driver.findElement(By.xpath("//p[text()='Admin Users']"));
		adminUser.click();
		WebElement managenews=driver.findElement(By.xpath("//p[text()='Manage News']"));
		managenews.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//input[@name='un']")).sendKeys("offer");
		driver.findElement(By.xpath("//button[@name='Search']")).click();
	}
	
	@Test
	public void refreshPageUsingTheResetButton()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin");
		WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		
		WebElement adminUser=driver.findElement(By.xpath("//p[text()='Admin Users']"));
		adminUser.click();
		WebElement managenews=driver.findElement(By.xpath("//p[text()='Manage News']"));
		managenews.click();
		
		driver.findElement(By.xpath("//a[text()=' Reset']")).click();
	}
	

}
