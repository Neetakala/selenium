package selenium_demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jyoti");
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		System.out.println(" Female gender is "+driver.findElement(By.xpath("//input[@value='Female']")).isEnabled());
		System.out.println(" Male gender is "+driver.findElement(By.xpath("//input[@value='Female']")).isEnabled());
	driver.findElement(By.xpath("//input[@name='exp']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/10/2010");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='tool-0']")).click();
	Thread.sleep(3000);
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='continents']"));
	dropdown.sendKeys(Keys.ARROW_DOWN);
	if(dropdown.getText().equalsIgnoreCase("europe")) {
		dropdown.click();
		//break;
		
		
	}
Thread.sleep(5000);
	}

}
