package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String text = "Shobhit";
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int a =10;
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys(text);
		int b=20;
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// To switch from web to alert.

		// driver.findElement(By.id("confirmbtn")).click();
		// WebDriverWait w = new WebDriverWait(driver,5);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
	}

}
