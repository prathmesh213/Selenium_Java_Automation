package Handling_CheckBoxes_And_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alerts_Using_Explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Explicit Wait Decleration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
	    Alert myalert =	mywait.until(ExpectedConditions.alertIsPresent());  // capture alert 
		
		 System.out.println(myalert.getText());
		 myalert.accept();	
		

	}

}
