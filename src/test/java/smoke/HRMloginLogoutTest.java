package smoke;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
 
public class HRMloginLogoutTest {
 
	WebDriver driver;
 
	@Before
	public void setup() {
 
		System.out.println("=====================setup===================");
 
		String browser = "firefox";
 
		if (browser.equalsIgnoreCase("CHROME")) {
 
			System.out.println("launch a chrome browser");
			
//			System.setProperty("webdriver.gecko.driver", "executiable file of chrome driver"); 144
			
			
//			WebDriverManager.chrome().setup();
			
			driver = new ChromeDriver();
 
		}
 
		else if (browser.equalsIgnoreCase("EDGE")) {
			System.out.println("launch a edge browser");
			driver = new EdgeDriver();
		}
 
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("launch a firefox browser");
			driver = new FirefoxDriver();
		}
 
		else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("launch a safari browser");
			driver = new SafariDriver();
		} else {
 
			System.out.println("===============execution on default browser: CHROME========================");
			driver = new ChromeDriver();
 
		}
 
		driver.manage().window().maximize();
 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
	}
 
	@After
	public void teardown() throws Exception {
 
		Thread.sleep(7000);
		System.out.println("=====================teardown===================");
		driver.quit();
	}
 
	@Test
	public void VerifyLoginFeature() {
 
		System.out.println("login and logout test case");
 
	}
 
}
