package smoke;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FindElementsExample {

    @Test
    public void findAllLinks() throws Exception {
        System.out.println("Launching Edge browser...");

        // Initialize EdgeDriver (ensure msedgedriver.exe is in PATH)
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open Amazon website
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);

       
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print total number of links found
        System.out.println("Total number of links on page: " + links.size());

        // Print text of first 10 links for reference
        for (int i = 0; i < Math.min(10, links.size()); i++) {
            System.out.println((i + 1) + ". " + links.get(i).getText());
        }

        // Wait and close browser
        Thread.sleep(2000);
        driver.quit();

        System.out.println("Edge browser closed successfully.");
    }
}
