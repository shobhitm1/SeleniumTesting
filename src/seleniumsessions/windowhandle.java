package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		Set<String>id= driver.getWindowHandles();
		Iterator<String>it =id.iterator();
		System.out.println(driver.getTitle());
		String Parent= it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		System.out.println("Firstly at Parent Window");
		System.out.println(driver.getTitle());
		System.out.println("Switched to Child Window");
		driver.switchTo().window(Parent);
		System.out.println(driver.getTitle());
		System.out.println("Switched back to Parent Window");
		
		
		

	}

}
