package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isDsiplayed( )
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean result =  logo.isDisplayed();
		System.out.println("Display Status :" +result);
		
		//isEnabled( ) 
		
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enabled status : " + status);
		
		//isSelected( )
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(".................Before Selection...............");
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("......................After Selection..................");
		male_rd.click();
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false 
		
		
		
		
	}

}
