package team;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        // Setup ChromeDriver (or whichever)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        if (driver != null) {
            driver.quit();
        }
    }
}
