package smoke;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

    String browser_name = "edge"; // Change this to "chrome" or "edge"

    @Test
    public void launch() throws InterruptedException {

        WebDriver driver = null;

        if (browser_name.equalsIgnoreCase("chrome")) {
            // Setup ChromeDriver automatically
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Launching the Chrome browser");
        } 
        else if (browser_name.equalsIgnoreCase("edge")) {
            // Setup EdgeDriver automatically
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Launching the Edge browser");
        } 
        else {
            System.out.println("Invalid browser name!");
            return;
        }

        // Open a simple website
        driver.get("https://www.google.com");
        System.out.println("Page Title: " + driver.getTitle());

        Thread.sleep(2000); // Wait for 2 seconds
        driver.quit();
        System.out.println("Browser closed successfully");
    }
}
