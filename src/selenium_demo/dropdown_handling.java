package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement objselect = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel = new Select(objselect);
		sel.selectByVisibleText("Select");
		//WebElement firstsel = sel.getFirstSelectedOption();

		//System.out.println("first element:" + firstsel);
		List<WebElement> list = sel.getOptions();
		
		for (WebElement i : list) {
			i.click();
			System.out.println(i.getText());

		}

	}

}
