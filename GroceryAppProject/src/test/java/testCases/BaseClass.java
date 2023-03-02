package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.ScreenshotUtility;

public class BaseClass {

	public static Properties prop;// declaring properties reference variable for using functions in properties
									// class
	WebDriver driver;

	ScreenshotUtility ss;

	public void testBasic() throws IOException {

		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
		prop.load(ip);// loading the external file to our project with the help of load fn nd which is
						// includes in properties class
	}

	@BeforeMethod(alwaysRun = true)

	@Parameters("browser")
	public void beforeMethod(String browserName) throws IOException {

		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();

		}
        
		testBasic();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("BaseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestresult) throws IOException {

		if (itestresult.getStatus() == ITestResult.FAILURE) {

			ss = new ScreenshotUtility();

			ss.captureFailureScreenShot(driver, itestresult.getName());
		}

		driver.quit();
	}
}
