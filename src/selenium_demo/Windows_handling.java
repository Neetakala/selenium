package selenium_demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gouri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	Thread.sleep(1000);
	Set<String> s= driver.getWindowHandles();//parent and child window will return
	
	
	
	Iterator<String> a=s.iterator();
	String parent_window =a.next();
	String child_window=a.next();
	driver.switchTo().window(child_window);
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	Thread.sleep(1000);
	driver.switchTo().window(parent_window);
	driver.findElement(By.xpath("//input[@value='radio1']")).click();//input[@value='radio1']

	}

}
/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows*/