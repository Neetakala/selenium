package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		//driver.switchTo().alert().accept();
		//Thread.sleep(500);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("neeta");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());


	}

}
