package Assignments;



import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 
  1.Open https://blazedemo.com/
  2.Select Departure city from drop down
  3.Select destination city from drop down
  4.click on find flights
  5.page will redirect to the table
  5.you have to find the lowest price in the table 
  6.once, find the lowest price click on choose This flight from the same row
  7.page will redirected to another form, fill the form 
  8.click on purchase flight
  9.validate the following message : "Thank you for your purchase today!"
 
 */



public class blazeDemo_Assignmet_Session32 {

	
	public static void main(String[] args) {
		
		

		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//Step 1 to 4 
		WebElement drop_Depart = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select drop_City_Depart = new Select(drop_Depart);
		
		drop_City_Depart.selectByValue("Mexico City");
		
		WebElement drop_Desti = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select drop_City_Desti = new Select(drop_Desti);
		drop_City_Desti.selectByValue("New York");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Step 5
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		
		
			
		List<WebElement> priceElements =driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
		
		double min_Price = Double.MAX_VALUE;
		int min_Index = -1;
		for(WebElement el : priceElements) {
			System.out.println(el.getText());
		}
		
		for(int i=0;i<priceElements.size();i++) {
			
			String priceText = priceElements.get(i).getText();
			double price = Double.parseDouble(priceText.replace("$",""));
			if(price < min_Price) {
				
				min_Price = price;
				min_Index = i;
			
		}
			
		}
		
		System.out.println("Minimum price is: "+min_Price);
		System.out.println("Minimum index is: "+min_Index);
		
		
		//clicking on minimum price
		
		driver.findElement(By.xpath("//table[@class='table']//tr["+min_Index+"]//td[1]//input")).click();
		
		
		
		//Filling the form
		driver.findElement(By.name("inputName")).sendKeys("Prathmesh");
		driver.findElement(By.id("address")).sendKeys("Narhe");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		driver.findElement(By.id("zipCode")).sendKeys("41048");
		
		WebElement drop_cardType = driver.findElement(By.id("cardType"));
		Select drop_card = new Select(drop_cardType);
		drop_card.selectByValue("visa");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("4104815478");
		driver.findElement(By.id("creditCardMonth")).sendKeys("January");
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("Prathmesh");
		
		System.out.println("Form Filled Successfully");
		
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		System.out.println("Form Submited Successfully");
		
		
		String Expected_Message = "Thank you for your purchase today!";
		String actual_Message = driver.findElement(By.xpath("//div[@class='container hero-unit']//h1")).getText();
				
		if(Expected_Message.equals(actual_Message)) {
			System.out.println("Message Validation Successfull!");
		}else {
			System.out.println("Message Validation Failed");
		}
						
		
	}
	
	
	
	
	
}
