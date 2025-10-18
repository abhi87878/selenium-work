package team;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
    }

    @Test
    public void handleSimpleAlert() throws Exception {
        // Click on button to open alert
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        Thread.sleep(1000);

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Print alert text
        System.out.println("Alert message: " + alert.getText());

        // Accept alert (click OK)
        alert.accept();

        System.out.println("Alert handled successfully!");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
