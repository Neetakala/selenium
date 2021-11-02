package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class w3school {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]")).click();
		/*WebElement l=  driver.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]"));
		Select a= new Select(l);
		a.selectByVisibleText("Learn HTML");*/
		
		driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[32]")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		driver.findElement(By.xpath("//input[@id='modalusername']")).sendKeys("neeta@gmail.com");
		driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("neeta");
		driver.findElement(By.xpath("((//button[@class='_1VfsI _OD95i _3_H0V'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[name()='path'])[10]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
