package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;

public class SubCategoryPage {

	public WebDriver driver;

	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Sub Category']")
	private WebElement subCategory;
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categorySelection;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subCategoryText;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement imageUploadButton;
	@FindBy(xpath = "//button[@name='create']")
	private WebElement saveButton;
	@FindBy(xpath = "//a[text()=' Reset']")
	private WebElement resetButton;
	@FindBy(xpath = "//a[text()=' Search']")
	private WebElement searchButton;
	@FindBy(xpath = "//select[@id='un']")
	private WebElement searchCategory;
	@FindBy(xpath = "//input[@name='ut']")
	private WebElement searchSubcategory;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchButtonOnSearchPage;

	@FindBy(xpath = "//h5 [text()=' Alert!']")
	private WebElement newSubCategoryAlert;
	@FindBy(xpath = "//h4[text()='List Sub Categories']")
	private WebElement refreshSubCategoryDisplayed;
	@FindBy(xpath = "//td[text()='Sports Toy Car2']")
	private WebElement searchSubcategoryIsDisplayed;

	public void clickOnSubCategoryButton() {
		subCategory.click();
	}

	public void clickOnNewButtonOfSubCategoryPage() {
		newButton.click();
	}

	public void selectCategoryFromSubCategoryCreationPage(String category1) {
		Select select = new Select(categorySelection);
		select.selectByContainsVisibleText(category1);
	}

	public void enterSubCategoryOfSubCategoryCreationPage(String subCategory1) {
		subCategoryText.sendKeys(subCategory1);
	}

	// 2 ways -- using excel or from constants class
	
//	public void selectImageOfSubCategoryCreationPage(String image) {
//		imageUploadButton.sendKeys(image);
//	}

	// CALLING USING CONSTANTS
	public void selectImageOfSubCategoryCreationPage() {
		imageUploadButton.sendKeys(Constants.IMAGEFILE);
	}

	public void clickOnSaveButtonOfSubCategoryCreationPage() {
		saveButton.click();
	}

	public void clickOnResetButtonOfSubCategoryPage() {
		resetButton.click();
	}

	public void clickOnSearchButtonOfSubCategoryPage() {
		searchButton.click();
	}

	public void selectCategoryFromSubCategorySearchPage(String category1) {
		Select select = new Select(searchCategory);
		select.selectByContainsVisibleText(category1);
	}

	public void enterSubCategoryOfSubCategorySearchPage(String subCategory1) {
		searchSubcategory.sendKeys(subCategory1);
	}

	public void clickOnSearchButtonOfSubCategorySearchPage() {
		searchButtonOnSearchPage.click();
	}

	public String getTextFromAlert() {
		return newSubCategoryAlert.getText();
	}

	public String getTextFromRefreshNewsDisplayed() {
		return refreshSubCategoryDisplayed.getText();
	}

	public boolean isSearchSubcategoryIsDisplayed() {
		return searchSubcategoryIsDisplayed.isDisplayed();
	}
}
