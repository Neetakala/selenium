package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*driver.findElement(By.xpath("//div[@class='home_flight_search']//*[text()='Flights']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).click();
		System.out.println("blr selected");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Chennai (MAA)']")).click();
		System.out.println("chennai selected");*/
		
			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("abd");
						
			Thread.sleep(1000);
			List<WebElement> list =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
			System.out.println(list.size());
			try {for(WebElement i: list) {
				if(i.getText().equalsIgnoreCase("India")){
					i.click();
					break;
					
				}
			}
		} catch (Exception e) {
			
			System.out.println("country not found");
		}
		
		Thread.sleep(500);
	}

}
