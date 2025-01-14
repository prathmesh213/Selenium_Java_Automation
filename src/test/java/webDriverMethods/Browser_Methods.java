
package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 
		 //get(  url  )  - open the url in browser 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click(); 
		 
		 Thread.sleep(5000);
		
		 //driver.close();  // close one window browser  (Wherever the driver is focused )
		 
		 driver.quit(); // close all window browser 
	}

}

package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 
		 //get(  url  )  - open the url in browser 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click(); 
		 
		 Thread.sleep(5000);
		
		 //driver.close();  // close one window browser 
		 
		 driver.quit(); // close a;; window browser 
	}

}

