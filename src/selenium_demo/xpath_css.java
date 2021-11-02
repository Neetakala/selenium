package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo1");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("djlfjf");
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//div[@id='username_container']//input[1]")).sendKeys("fsdf");
		driver.findElement(By.xpath("(//form[@name='login']//input)[22]")).sendKeys("shdkh");
		Thread.sleep(2000);
		driver.quit();
		//driver.close();

	}

}
/*xpath syntax
tagname[@attribute='value']
css syntax
tagname[attribute='value']
parent child traverssal
syntax:- //tagname[@attribute='value']//tagname(child)
*/

