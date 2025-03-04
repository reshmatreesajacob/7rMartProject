package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),' Admin')]")
	private WebElement adminUsers;
	@FindBy(xpath = "//p[text()='Manage Users']")
	private WebElement manageUsers;
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newUser;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement newUsername;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement newPassword;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userType;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement saveButton;
	@FindBy(xpath = "//a[text()=' Reset']")
	private WebElement resetButton;
	@FindBy(xpath = "//a[text()=' Search']")
	private WebElement searchButton;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchUsername;
	@FindBy(xpath = "//select[@id='ut']")
	private WebElement searchUserType;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchButtonInSearchPage;
	@FindBy(xpath = "//h5 [text()=' Alert!']")
	private WebElement newUserAlert;
	@FindBy(xpath = "//h4[text()='Admin Users']")
	private WebElement refreshUsersIsDisplayed;
	@FindBy(xpath = "//td[text()='movieuser']")
	private WebElement searchUserListIsDisplayed;

	public void clickOnAdminUsersButton() {
		adminUsers.click();
	}

	public void clickOnManageUsersButton() {
		manageUsers.click();
	}

	public void clickOnNewButton() {
		newUser.click();
	}

	public void enterNewUsernameOnUsernameField(String username) {
		newUsername.sendKeys(username);
	}

	public void enterNewPasswordOnPasswordField(String password) {
		newPassword.sendKeys(password);
	}

	public void selectNewUserTypeOnUserTypeField(String userType) {
		Select user = new Select(this.userType);
		user.selectByContainsVisibleText(userType);
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

	public void clickOnResetButton() {
		resetButton.click();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void enterUsernameOnUsernameFieldOfSearchPage(String username) {
		searchUsername.sendKeys(username);
	}

	public void selectUserTypeOnUserTypeFieldOfSearchPage(String userType) {
		Select user = new Select(this.searchUserType);
		user.selectByContainsVisibleText(userType);
	}

	public void clickOnSearchButtonInSearchPage() {
		searchButtonInSearchPage.click();
	}

	public String getTextFromAlert() {
		return newUserAlert.getText();
	}

	public String getTextFromRefreshUserDisplayed() {
		return refreshUsersIsDisplayed.getText();
	}

	public boolean isSearchAUserIsDisplayed() {
		return searchUserListIsDisplayed.isDisplayed();
	}
}
