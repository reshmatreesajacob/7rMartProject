package automationCore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void intializeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login\r\n");
	}

	@AfterMethod
	public void diverquit() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.quit();
	}

}
