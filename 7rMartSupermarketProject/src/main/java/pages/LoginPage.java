package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// initElements is a method to initialize the elements in this class in
		// PageFactory class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordField;
	@FindBy(xpath = "//label[@for='remember']")
	private WebElement rememberMeCheckbox;
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signIn;

	public void enterUsernameOnUsernameField(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnCheckbox() {
		rememberMeCheckbox.click();
	}

	public void clickOnSignInButton() {
		signIn.click();
	}
}
