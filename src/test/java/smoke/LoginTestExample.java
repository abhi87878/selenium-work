package smoke;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertTrue;

public class LoginTestExample {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.out.println("Launching Edge browser...");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(2000);
    }

    @Test
    public void testLoginLogoutFlow() throws Exception {
        System.out.println("Starting Login Test...");

        // Step 1: Enter valid credentials
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

        // Step 2: Click Login button
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);

        // Step 3: Verify successful login message
        WebElement successMsg = driver.findElement(By.id("flash"));
        String loginText = successMsg.getText();
        System.out.println("Login Message: " + loginText);
        assertTrue("Login failed!", loginText.contains("You logged into a secure area!"));

        // Step 4: Click Logout
        driver.findElement(By.cssSelector("a.button.secondary.radius")).click();
        Thread.sleep(2000);

        // Step 5: Verify successful logout message
        WebElement logoutMsg = driver.findElement(By.id("flash"));
        String logoutText = logoutMsg.getText();
        System.out.println("Logout Message: " + logoutText);
        assertTrue("Logout failed!", logoutText.contains("You logged out of the secure area!"));

        System.out.println("Login and Logout flow verified successfully!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Closing browser...");
        Thread.sleep(2000);
        driver.quit();
    }
}
