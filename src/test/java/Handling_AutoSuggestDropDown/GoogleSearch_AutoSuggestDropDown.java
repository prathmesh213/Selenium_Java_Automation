package session_32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//search box
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	
		System.out.println(list.size());
		
		for(WebElement el: list) {
			System.out.println(el.getText());
			if(el.getText().equals("selenium")) {
				el.click();
				break;
			}
		}
	}
}
