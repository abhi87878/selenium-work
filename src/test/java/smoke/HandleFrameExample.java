 
package smoke;
 
import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
 
public class HandleFrameExample extends BaseTestJUNIT{


	@Test

	public void verifyImageProperty() {

		//concept

		WebElement myFrame = driver.findElement(By.cssSelector("[src*='photo']"));


		//switch to frame


		//index

//		driver.switchTo().frame(0);

		//name or id 

//		driver.switchTo().frame("name or id");

		//webElemnt

		driver.switchTo().frame(myFrame);






		WebElement img3 = driver.findElement(By.cssSelector("[src='images/high_tatras3_min.jpg']"));

		System.out.println("Alt attribute: " + img3.getAttribute("alt"));

		System.out.println("src attribute: " + img3.getAttribute("src"));

	}
 
}

 