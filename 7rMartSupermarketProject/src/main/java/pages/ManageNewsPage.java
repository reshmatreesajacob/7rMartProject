package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy (xpath = "//p[text()='Admin Users']" )
//	private WebElement adminUser;
	@FindBy (xpath = "//p[text()='Manage News']")
	private WebElement manageNews;
	@FindBy (xpath = "//a[text()=' New']")
	private WebElement newButton;
	@FindBy (xpath = "//textarea[@id='news']")
	private WebElement news;
	@FindBy (xpath = "//button[@name='create']")
	private WebElement saveButton;
	
	public void clickOnManageNewsButton()
	{
		manageNews.click();
	}
	
	public void clickOnNewButtonOfManageNewsPage()
	{
		newButton.click();
	}
	
	public void enterNewNewsOnNewsField(String news)
	{
		this.news.sendKeys(news);
	}
	
	public void clickOnSaveButtonOfNewNewsCreationpage()
	{
		saveButton.click();
	}
	
}
