package Handling_CheckBoxes_And_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		
		//Normal alert with ok button 
/*		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		 Alert myalert =driver.switchTo().alert();
		 System.out.println(myalert.getText());
		 myalert.accept();
*/

		
		// Confirmation alert - Ok and Cancle button 

/*
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); // close alert using Ok button
		driver.switchTo().alert().dismiss(); // close alert using Cancle  button
*/
		
		// Prompt alert 
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		 Alert myPromptAlert  =driver.switchTo().alert();
		 myPromptAlert.sendKeys("welcome");
		 myPromptAlert.accept(); 
		
		
		
	}

}
