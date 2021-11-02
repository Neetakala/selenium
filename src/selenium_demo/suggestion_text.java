package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestion_text {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("my name is neeta");
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).isDisplayed());
		String heading =driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
		System.out.println("the text is:"+heading);
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	
	Thread.sleep(1000);
driver.close();
	}

}//123jfdkj
