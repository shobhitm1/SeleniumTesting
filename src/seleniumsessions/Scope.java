package seleniumsessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("Total links at this page are :- " + driver.findElements(By.tagName("a")).size());
		Collection ct =new ArrayList();
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		for (int i = 0; i < column.findElements(By.tagName("a")).size(); i++) 
		{
			String newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(newtab);
			Thread.sleep(5000L);
		}
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			while (it.hasNext()) {
				String next =it.next();
				driver.switchTo().window(next);
				System.out.println(driver.getTitle());
			}
		
	}

}
