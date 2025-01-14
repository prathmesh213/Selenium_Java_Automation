package TestCase_Assignments;

/*
assignment : 

URL =  https://testautomationpractice.blogspot.com/

1.provide some string for  search eg.(Selenium)
2.count the number of links 
3.click on each link using for loop
4.get windows id for every browser window 
5.close specific browser window

*/


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        // Perform search
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //decleration

        // Wait for search results to load 
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@id, 'Wikipedia1_wikipedia-search')]//a")));

        List<WebElement> searchres = driver.findElements(By.xpath("//div[contains(@id, 'Wikipedia1_wikipedia-search')]//a"));
        System.out.println("No of links are: " + searchres.size());

        // Get the current window handle (parent window)
        String mainWindowHandle = driver.getWindowHandle();

        // Click all the links
        for (int i = 0; i < searchres.size(); i++) {
            WebElement link = searchres.get(i);
            System.out.println("Clicking on link: " + link.getText());

            // Click on the link (which opens a new tab)
            link.click();
        }

        // After clicking all links, handle the new windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Iterate through the window handles and close based on title
        for (String winID : windowHandles) {
            // Switch to the window
        	 String title =driver.switchTo().window(winID).getTitle();
            
            System.out.println("Window Title: " + title);
            System.out.println("Browser Id "+winID);

            // Check if the window title is empty or contains "data:"
            if (title.isEmpty() || title.equals("data:") || title.equals("Selenium disulfide - Wikipedia")) {
                System.out.println("Closing window with title : "+title);
                driver.close();  // Close the invalid window
            }
         
        }

        driver.switchTo().window(mainWindowHandle);
       
        // Close the main window
        driver.quit();
    }
}
