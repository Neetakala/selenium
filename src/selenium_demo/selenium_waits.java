package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_waits {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExceptedConditions.visibilityOfElementLocated(By.xpath(null)));
		

	}

}
/*
3 types of waits
1.implicit wait- waits for all the elements and is declared once
2.explicit wait-waits everytime for the element wherever this is declared eg.Thread.sleep
3.fluent wait-works on regular intervals-->pollingEvery(5, TimeUnit.SECONDS)
*/
