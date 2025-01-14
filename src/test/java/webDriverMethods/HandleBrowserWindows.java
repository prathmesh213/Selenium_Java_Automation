<<<<<<< HEAD
package webDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		// Approach1 - converting set to list 
		
	/*
	 
	 	List<String> windowID = new ArrayList(windowIDs);
		String parentID =windowID.get(0);
		String childID = windowID.get(1);
	
	*/
	
/*		
		// Switch to child window 
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		// Switch to parent 
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle()); 
		
*/
		
		// Approach 2 - for multiple browser windows 
		
		for(String winID : windowIDs ) {
			 String title =driver.switchTo().window(winID).getTitle();
			 
			 if(title.equals("OrangeHRM")) {
				 // validations on parent window 
				 System.out.println(driver.getCurrentUrl());
				 
			 }
		}
		
		
	}
}
=======
package webDriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		// Approach1 - converting set to list 
		
	/*
	 
	 	List<String> windowID = new ArrayList(windowIDs);
		String parentID =windowID.get(0);
		String childID = windowID.get(1);
	
	*/
	
/*		
		// Switch to child window 
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		// Switch to parent 
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle()); 
		
*/
		
		// Approach 2 - for multiple browser windows 
		
		for(String winID : windowIDs ) {
			 String title =driver.switchTo().window(winID).getTitle();
			 
			 if(title.equals("OrangeHRM")) {
				 // validations on parent window 
				 System.out.println(driver.getCurrentUrl());
				 
			 }
		}
		
		
	}
}
>>>>>>> 2cfb20eb9c9ce003eb31dfc934ea4b81e9ca04b8
