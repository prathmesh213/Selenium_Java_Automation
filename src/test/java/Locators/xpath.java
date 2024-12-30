package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		boolean element = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
	    System.out.println(element);
		
		//Relative xpath with single attribute  
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("macbook");
		
		//Relative xpath with multiple attributes 
		driver.findElement(By.xpath("//input[@placeholder='Search'][@type='text']")).sendKeys("mac");
		
		//Xpath with and operator 
		
		driver.findElement(By.xpath("//input[@placeholder='Search' and @type='text']")).sendKeys("value");
		
		//xpath with or operaot 
		
		driver.findElement(By.xpath("//input[@placeholder='Search' or @type='xyzz']")).sendKeys("val");
		
		//xpath with text (inner text)
		driver.findElement(By.xpath("//*[text() ='MacBook']")).click();
		
		//xpath with contains() method 
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("mac");
		
		//xpath with starts-with
		
		driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("mak");
		
		
		
	
 		
		
		
		
		driver.quit();
	}

}
