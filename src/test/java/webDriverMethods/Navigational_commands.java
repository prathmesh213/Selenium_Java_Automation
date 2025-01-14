<<<<<<< HEAD
package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
	   //	driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://www.orangehrm.com/");
		
		//navigate back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//navigate forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//Refresh
		driver.navigate().refresh();
	}

}
=======
package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
	   //	driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://www.orangehrm.com/");
		
		//navigate back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//navigate forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//Refresh
		driver.navigate().refresh();
	}

}
>>>>>>> 2cfb20eb9c9ce003eb31dfc934ea4b81e9ca04b8
