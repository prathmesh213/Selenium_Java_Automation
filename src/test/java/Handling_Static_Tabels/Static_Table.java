package session_32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1.Find total no of rows in a table
		
		 int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		 
		 System.out.println("No of rows: "+rows);
		 
		//2.Find total no of columns in a table 
		 
		 int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		 
		 System.out.println("No of Columns: "+columns);
		 
		 //3.Read data from specific row and column (eg. 5 th row and 1 st column)
		 
		String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(BookName);
		System.out.println();
		
		//4.Read the data from all the rows and columns
		
//		for(int r =2;r<=rows;r++) {
//			for(int c=1;c<=columns;c++) {
//				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"\t");
//			}
//			System.out.println();
//		}
//		
		
		
		//5.Print Book Name where the author is Mukesh 
		for(int r=2;r<=rows;r++) {
			String authorname =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(authorname);
			if(authorname.equals("Mukesh")) {
				String Book =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Book+" Author:"+authorname);
			}
		
		}
		
		
		//6.Find Total price of All the Books
		int sum =0;
		for(int r =2;r<=rows;r++) {
			
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				sum+=Integer.parseInt(price);
		//driver.quit();
		
	}
		 System.out.println("Total Price of the Books:"+sum);
	}
}	
