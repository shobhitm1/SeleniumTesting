package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		WebElement table1=table.findElements(By.tagName("tr")).get(0);
		System.out.println(table1.findElements(By.tagName("th")).size());
		WebElement table2=table.findElements(By.tagName("tr")).get(2);
		List<WebElement> weblist= table2.findElements(By.tagName("td"));
		System.out.println(weblist.get(0).getText());
		System.out.println(weblist.get(1).getText());
		System.out.println(weblist.get(2).getText());
	}

}
