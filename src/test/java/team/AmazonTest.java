package team;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class AmazonTest {

    WebDriver driver;
    Logger log;

    @BeforeTest
    public void launchApp() throws Exception {

        // Configure Log4j properties file
        String log4jPath = System.getProperty("user.dir") + "\\src\\test\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jPath);

        // Initialize logger
        log = Logger.getLogger(AmazonTest.class);
        log.info("=============== Starting AmazonTest ===============");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("Chrome browser launched successfully");

        driver.manage().window().maximize();
        log.info("Browser window maximized");

        // Open the application
        driver.get(Constants.appURL);
        log.info("Navigated to application URL: " + Constants.appURL);

        Thread.sleep(3000);
    }

    @AfterTest
    public void closeApp() {
        log.info("Closing the browser...");
        if (driver != null) {
            driver.quit();
        }
        log.info("=============== Test Execution Completed ===============");
    }
}
