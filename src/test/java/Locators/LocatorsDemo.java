package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name 
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
		boolean logodisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logodisplayedStatus);
		
		//linktext or partial link text
		
		driver.findElement(By.linkText("Tablets")).click();
		
		driver.findElement(By.partialLinkText("Table")).click();
		
		
		// note: got an incorrect output for the group elements locators ie. tag name and class name 
		
		//class name
		
	    List<WebElement> HeaderLinks =	driver.findElements(By.className("list-inline-item"));
	    System.out.println("Total no of elements:"+ HeaderLinks.size());
	    
	    //tag name 
	    List<WebElement> links =driver.findElements(By.tagName("a"));
	    System.out.println("Total no of links:"+ links.size());
	    
	    List<WebElement> images =driver.findElements(By.tagName("img"));
	    System.out.println("Total no of images:"+images.size());
		
	}

}
