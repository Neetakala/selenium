package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		//a.dragAndDrop(drag, drop).build().perform();-------> also applicable

		
	}

}
