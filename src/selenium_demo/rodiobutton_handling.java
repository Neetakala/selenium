package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rodiobutton_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> obj =driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		for(WebElement i : obj) {
			i.click();
			System.out.println(i);
			if(i.getAttribute("value").equalsIgnoreCase("Option2")) {
				i.click();
				System.out.println("optiion 2 clicked");
				break;
								
			}
			
			
		}
		System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).isSelected());
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
