package webDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_Specific_Browser_Window {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set<String> windowIDs = driver.getWindowHandles();
		 
		 for(String winID : windowIDs) {
			 
			  String title = driver.switchTo().window(winID).getTitle();
			  System.out.println(title);
			  if(title.equals("OrangeHRM") || title.equals("some other title ")) {
				  driver.close();  
			  }
		 }
		 
		 
		 
	}

}
