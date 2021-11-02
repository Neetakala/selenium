package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_demo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Actions a = new Actions(driver);
		WebElement d=driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
		//a.contextClick(d).perform();
		//a.doubleClick(d).perform();
		

	}

}
