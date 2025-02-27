package testScript;

import java.beans.Transient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;

public class AdminUserTest extends Base
{	
	@Test
	public void addNewUserToUsersList()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[contains(text(),' Admin')]")).click();
		driver.findElement(By.xpath("//p[text()='Manage Users']")).click();
		
		driver.findElement(By.xpath("//a[text()=' New']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Reshma");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		WebElement userType=driver.findElement(By.xpath("//select[@id='user_type']"));
		Select user=new Select(userType);
		user.selectByContainsVisibleText("Staff");
		driver.findElement(By.xpath("//button[@name='Create']")).click();
	}
	
	@Test
	public void refreshPageUsingResetButton()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[contains(text(),' Admin')]")).click();
		driver.findElement(By.xpath("//p[text()='Manage Users']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Reset']")).click();
	}
	
	@Test
	public void searchUsersInTheUsersList()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[contains(text(),' Admin')]")).click();
		driver.findElement(By.xpath("//p[text()='Manage Users']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("Reshma");
		WebElement userType1=driver.findElement(By.xpath("//select[@id='ut']"));
		Select user=new Select(userType1);
		user.selectByContainsVisibleText("Staff");
		driver.findElement(By.xpath("//button[@name='Search']")).click();
	}
}
