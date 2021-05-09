package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);//driver will get the capabilites of action class
		WebElement move =driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
		a.contextClick();
		a.build().perform();
		
		a.moveToElement(move).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("OnePlusPhone")
		.doubleClick();
		a.build().perform();
		
		
	}

}
