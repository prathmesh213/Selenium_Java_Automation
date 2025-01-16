package Handling_CheckBoxes_And_Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handel_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1 selecting specific checkbox 
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. select all checkboxes 
		
		 List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@Class = 'form-check-input' and @type='checkbox']"));
		
		 //Using for loop 
		 
		 
/*
		   for(int i=0; i<checkBoxes.size() ; i++) {
			 checkBoxes.get(i).click(); 
		 }
 */
		 
		 //Using Enhanced For Loop
/*	 
		 for(WebElement select : checkBoxes) {
			 select.click();
		 }
		
 */
		 
		 //Select last 3 checkBoxes 
		 
		//  total no of checkboxes - how many checkboxes want to select = starting index 

/*
		 for(int i = 4; i <checkBoxes.size();i++) {
			  checkBoxes.get(i).click(); 
		  }
*/

/*
		  // select first 3 checkBoxes 
  
		  for(int i = 0;  i < 3;i++) {
              checkBoxes.get(i).click();			  
		  }
*/		  
		  // unselect the checkBoxes if they are selected 
		  
		  for(int i=0;i<3;i++) {
			  checkBoxes.get(i).click();
		  }
		  
		  Thread.sleep(5000);
		  
		 for(WebElement checkbox : checkBoxes) {
			boolean status = checkbox.isSelected();
			if(status == true ) {
				checkbox.click();
			}
		 }
  
		 
		  
		  
		 
		 
		 
		 
		  
		
		  
		
	}

}
