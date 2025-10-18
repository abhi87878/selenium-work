package team;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mm extends BaseTestJUNIT {

    @Test
    public void verifyCheckBox() {
        System.out.println("=== verifyCheckBox test case ===");

        // Locate all checkboxes with name='vehicle'
        List<WebElement> allCheckbox = driver.findElements(By.cssSelector("[name='vehicle']"));
        System.out.println("Checkbox count: " + allCheckbox.size());

        // Select all checkboxes
        SelectAllCheckbox(allCheckbox);

        // Uncomment below line to select a specific checkbox by its visible text
        // SelectCheckboxUsingText(allCheckbox, "Boat");
    }

    // ✅ Select all checkboxes
    public void SelectAllCheckbox(List<WebElement> ele) {
        for (int i = 0; i < ele.size(); i++) {
            ele.get(i).click();
        }
        System.out.println("All checkboxes selected successfully.");
    }

    // ✅ Select a specific checkbox using visible label text
    public void SelectCheckboxUsingText(List<WebElement> ele, String value) {
        for (WebElement checkbox : ele) {
            // Get the label text associated with each checkbox
            String labelText = checkbox.getAttribute("value");
            System.out.println("Checkbox value: " + labelText);

            if (labelText.equalsIgnoreCase(value)) {
                System.out.println("Selecting checkbox: " + value);
                checkbox.click();
                break;
            }
        }
    }
}
