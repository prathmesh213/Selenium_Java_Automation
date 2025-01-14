<<<<<<< HEAD
package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

 public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
	 
	 //get(  url  )  - open the url in browser 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 Thread.sleep(5000);
	 
	 //getTitle ( )  - Returns the title of the webpage 
	 System.out.println(driver.getTitle( ));
	 
	 // getCurrentUrl( )  -  Returns the URL of the page 
	 System.out.println(driver.getCurrentUrl());
	 
	 
	 //getWindowHandle() - Returns the id of single Browser  window
	// String windowid = driver.getWindowHandle();
	// System.out.println("Windows Id : "+ windowid );
	 
	 
	 //getWindowHandle() - Returns the id's  of Multiple  Browser  window
	 
	 driver.findElement(By.linkText("OrangeHRM, Inc")).click();   //opens another browser window
	  
	
	Set< String>  window_ids =driver.getWindowHandles();
	System.out.println( window_ids);
	 	
	 
	 driver.quit();
	 
}
}
=======
package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

 public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
	 
	 //get(  url  )  - open the url in browser 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 Thread.sleep(5000);
	 
	 //getTitle ( )  - Returns the title of the webpage 
	 System.out.println(driver.getTitle( ));
	 
	 // getCurrentUrl( )  -  Returns the URL of the page 
	 System.out.println(driver.getCurrentUrl());
	 
	 
	 //getWindowHandle() - Returns the id of single Browser  window
	// String windowid = driver.getWindowHandle();
	// System.out.println("Windows Id : "+ windowid );
	 
	 
	 //getWindowHandle() - Returns the id's  of Multiple  Browser  window
	 
	 driver.findElement(By.linkText("OrangeHRM, Inc")).click();   //opens another browser window
	  
	
	Set< String>  window_ids =driver.getWindowHandles();
	System.out.println( window_ids);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 driver.quit();
	 
}
}
>>>>>>> 2cfb20eb9c9ce003eb31dfc934ea4b81e9ca04b8
