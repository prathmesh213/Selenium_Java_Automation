package BySdetQA;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
TestCase
1) Open Edge  Browser
2) Open url " https://demo.nopCommerce.com/ "
3) Validate the title should be " nopCommerce demo store "
4) Close browser 

*/
public class LaunchEdge {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.nopCommerce.com/");
		String title =driver.getTitle();
		
		if(title.equals("nopCommerce demo store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		driver.quit();
	}

}
