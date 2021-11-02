package selenium_demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chechbox_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		// to select single element
		List<WebElement> obj=driver.findElements(By.xpath("//input[@class='radioButton']"));
		  for(WebElement i: obj) 
		  { i.click(); 
		  System.out.println("all radio checked");
			  System.out.println(i.getAttribute("value"));
			  if(i.getAttribute("value").equalsIgnoreCase("Radio2")) {
				  System.out.println(i.getAttribute("value"));
				  i.click();
				  break;
			  }
		  
		  
	WebElement a= driver.findElement(By.xpath("//input[@value='radio1']"));
	
	
	
	System.out.println(a.isSelected());
	System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isEnabled());
	//driver.findElement(By.xpath("//input[@value='radio1']")).
	
	
	
	//System.out.println((obj.size()));
		 //driver.findElement(By.xpath(("//button[@id='openwindow']"))
		 
		
		Thread.sleep(2000);
		driver.quit();

	}

}