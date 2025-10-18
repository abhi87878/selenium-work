package team;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestJUNIT {
    protected WebDriver driver;

    @Before
    public void launchApp() throws InterruptedException {
        System.out.println("=============== launchApp ===============");

        // Launch Chrome browser and open application
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

        Thread.sleep(3000);
    }

    @After
    public void closeApp() throws Exception {
        System.out.println("=============== closeApp ===============");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}
