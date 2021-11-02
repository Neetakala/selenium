package selenium_demo_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*
		 * List<WebElement> list=
		 * driver.findElements(By.xpath("//input[@type='radio']")); for(WebElement
		 * i:list) { i.click(); Thread.sleep(500);
		 * 
		 * }
		 */
		/*
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		 * driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("indi");
		 * Thread.sleep(5000); List<WebElement>
		 * list1=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		 * for(WebElement j: list1) { System.out.println(list1.size());
		 * if(j.getText().equalsIgnoreCase("india")) {
		 * 
		 * j.click(); Thread.sleep(1000); System.out.println("hello");
		 * System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")
		 * ).getAttribute("value")); break;
		 * 
		 * }
		 * 
		 * 
		 * } Thread.sleep(2000); //
		 * System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")
		 * ).getText());
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement
		 * opt=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 * Select sel=new Select(opt); sel.selectByVisibleText("Select");
		 * List<WebElement> l=sel.getOptions(); for(WebElement i:l) { i.click();
		 * Thread.sleep(1000); System.out.println(i.getText()); }
		 */
		List<WebElement> check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		for (WebElement i : check_box) {
			// i.click();

			// System.out.println(i);

			if (i.getAttribute("type").equalsIgnoreCase("option2")) {
				i.click();
				System.out.println(i.getAttribute("value"));
				break;

			}
		}

		driver.quit();
	}

}
