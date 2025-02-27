package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCore.Base;

public class SubCategoryTest extends Base
{
	
	@Test
	public void addNewItemToSubCategoryList()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
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
	public void refreshPageUsingResetButton()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[text()='Sub Category']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Reset']")).click();
	}
	
	@Test
	public void searchItemsInTheSubCategoryList()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//p[text()='Sub Category']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
		WebElement category=driver.findElement(By.xpath("//select[@id='un']"));
		Select select=new Select(category);
		select.selectByContainsVisibleText("Toys");
		
		driver.findElement(By.xpath("//input[@name='ut']")).sendKeys("Sports");
		
		driver.findElement(By.xpath("//button[@name='Search']")).click();
	}

}
