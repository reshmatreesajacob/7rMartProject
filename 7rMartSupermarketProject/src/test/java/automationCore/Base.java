package automationCore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void intializeBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else
			throw new Exception("Invalid Browser");

		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login\r\n");
	}

	@AfterMethod
	// This method handles quitting the WebDriver after the test execution
	// It also captures a screenshot if the test fails
	// ITestResult-->interface in TestNG that manages lifecycle of a testcase result
	public void driverQuit(ITestResult iTestResult) throws IOException {
		// Check if the test case has failed
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			// If the test fails, take a screenshot
			// Create an instance of ScreenshotUtility
			ScreenshotUtility screenShot = new ScreenshotUtility();
			// Capture a screenshot with the test name
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		// Quit the WebDriver session
		driver.quit();

	}

}
