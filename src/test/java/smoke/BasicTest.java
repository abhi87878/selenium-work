package smoke;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

    WebDriver driver;

    @Before
    public void launchApp() throws Exception {
        System.out.println("Launch the application");

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Open Amazon site
        driver.get("https://www.amazon.in");

        // Maximize browser window
        driver.manage().window().maximize();

        // Wait for 3 seconds
        Thread.sleep(3000);
    }

    @After
    public void closeApp() throws Exception {
        System.out.println("Close the application");

        // Wait for 7 seconds before closing
        Thread.sleep(7000);

        // Quit browser
        driver.quit();
    }
}
