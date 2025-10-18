package smoke;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonTest {
	
@Test	
	public void amazon() {
		
	 System.out.println("Test Case Execution");
	 WebDriver Wt = new EdgeDriver();
	 
	 
	 Wt.get("https://www.google.com");
	 System.out.println("Application URL: " +Wt.getCurrentUrl());
	 System.out.println("Application URL: " +Wt.getTitle());
	 
	}

}

