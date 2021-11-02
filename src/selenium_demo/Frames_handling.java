package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_handling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
				driver.switchTo().frame("courses-iframe");
driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Courses (and counting!)')]")).click();
Thread.sleep(1000);
System.out.println(driver.getTitle());
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//input[@value='radio1']")).click();
	}

}
