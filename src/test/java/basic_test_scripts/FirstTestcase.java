package BySdetQA;

/*
TestCase
1) Open Browser
2) Open url https://demo.opencart.com/
3) Validate the title should be "Your Store"
4) Close browser 

*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class FirstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String Title =driver.getTitle();
		
		if(Title.equals("Your Store"))
		{
			System.out.println("Test case passed");
		} 
		else
		{
			System.out.println("Test case failed");
		}
		
		driver.quit();
	}

}
