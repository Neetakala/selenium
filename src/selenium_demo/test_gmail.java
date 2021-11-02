package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro%2Fsigning-in-to-google&dsh=S-653263979%3A1633539675732266&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("neeta");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("neeta_kalashetti");
		Thread.sleep(1500);
		String at = driver.getTitle();
		String t = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(t)) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}

	}

}

// absolute path-parent child
// relative path- direct element reference-most refered in practical
//webdriver is the interface

//-->//a[contains(text(),'')]
