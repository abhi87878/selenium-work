package smoke;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class amazontestcase extends Basetest {

    @Test
    public void searchTab() throws Exception {
        System.out.println("Amazon test case: searching for iPhone...");
        Thread.sleep(4000);

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        Thread.sleep(5000);
    }
}