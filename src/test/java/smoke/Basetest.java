package smoke;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
WebDriver driver ;
	
	@Before
	public void launchApp() throws Exception {
		
		System.out.println("launch the application");
		
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@After
	public void closeApp() throws Exception {
		
		System.out.println("close the application");
		Thread.sleep(7000);
		driver.quit();
	}
	
	
	
	
}
 