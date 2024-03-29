package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("demo1");
		driver.findElement(By.id("password")).sendKeys("qwer");
		//driver.findElement(By.className("pw")).sendKeys("hdfksj");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("rememberUn")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password?')]")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		

	}

}
