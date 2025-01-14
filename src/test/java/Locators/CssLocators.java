package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopCommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id 
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tag.classname
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("pants");
		
		//tag[attribute = "value"]
		
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("apple");
		
		//tag.class[attribute]
		
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("mobile");
	}

}
