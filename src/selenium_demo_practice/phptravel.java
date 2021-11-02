package selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phptravel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://phptravels.com/");
				System.out.println(driver.findElement(By.xpath("//img[@src][1]")).getAttribute("alt"));
				driver.navigate().refresh();
				driver.findElement(By.xpath("(//a[normalize-space()='Demo'])[1]")).click();
				Thread.sleep(5000);
				System.out.println(driver.findElement(By.xpath("(//h2[normalize-space()='Application Test Drive'])[1]")).getText());
				driver.close();
	}

}
