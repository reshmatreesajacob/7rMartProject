package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Manage News']")
	private WebElement manageNews;
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement news;
	@FindBy(xpath = "//button[@name='create']")
	private WebElement saveButton;
	@FindBy(xpath = "//a[text()=' Reset']")
	private WebElement resetButton;
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	private WebElement searchButton;
	@FindBy(xpath = "//input[@name='un']")
	private WebElement searchNews;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchButtonOnSearchPage;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement newNewsAlert;
	@FindBy(xpath = "//h4[text()='Manage News']")
	private WebElement refreshNewsDisplayed;
	@FindBy(xpath = "//td[text()='OFFERR!! OFFERR!!']")
	private WebElement searchNewsIsDisplayed;

	public void clickOnManageNewsButton() {
		manageNews.click();
	}

	public void clickOnNewButtonOfManageNewsPage() {
		newButton.click();
	}

	public void enterNewNewsOnNewsField(String news) {
		this.news.sendKeys(news);
	}

	public void clickOnSaveButtonOfNewNewsCreationpage() {
		saveButton.click();
	}

	public void clickOnResetButtonOfManageNewsPage() {
		resetButton.click();
	}

	public void clickOnSearchButtonOfManageNewsPage() {
		searchButton.click();
	}

	public void enterSearchNewsOnSearchNewsField(String news) {
		searchNews.sendKeys(news);
	}

	public void clickOnSearchButtonOfSearchNewsPage() {
		searchButtonOnSearchPage.click();
	}

	public String getTextFromAlert() {
		return newNewsAlert.getText();
	}

	public String getTextFromRefreshNewsDisplayed() {
		return refreshNewsDisplayed.getText();
	}

	public boolean isSearchNewsIsDisplayed() {
		return searchNewsIsDisplayed.isDisplayed();
	}

}
