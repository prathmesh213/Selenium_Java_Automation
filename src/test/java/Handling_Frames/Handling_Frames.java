package Handling_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Frame1
		WebElement  frame1 =driver.findElement(By.xpath(" //frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);   //Passed frame as WebElement
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); // Switch back  to page
		
		// Frame2 
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hey there");
		driver.switchTo().defaultContent();
		
		// Frame3 (which contains iframe)
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//now we are in frame 3 now we will interact with *inner frame*
		// inner frame ---> prat of frame3
		
		// now we have only one frame inside frame3 . so we can use the indexing concept ie. just put 0 as index 
		
		driver.switchTo().frame(0);   // switching to frame using index 
		
		// here in the inner frame elements are inside div tag , then i frame , then another div tag and complex part is there . so we can just search for the link of the iframe so that we can open it separately in the another tab . now selector hub also can give the xpath and all for interacting with webelements of iframe 
		
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		//can do the same with javaScriptExecuter 
		
		WebElement radiobtn = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", radiobtn);
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
