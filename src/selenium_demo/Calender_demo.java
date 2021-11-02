package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//td[@class='day']"));
		for(int i=0; i<list.size();i++) {
			String value=list.get(i).getText();
			if(value.equalsIgnoreCase("26")) {
				list.get(i).click();
				break;
				
			}
			
		}
	}

}


//for information
//driver.findElement(By.xpath("(//input[@id='travel_from'])[1]")).sendkeys.Keys.Down;