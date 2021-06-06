package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadCheck {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		long curentTime=System.currentTimeMillis();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		long finalTime=System.currentTimeMillis();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		boolean b =js.executeScript("return document.readyState").equals("complete");
		if(b) {
			System.out.println("Page is Loaded Successfully");
		}
		else {
			System.out.println("You gotta wait more");
		}
		long f = finalTime-curentTime;
		System.out.println("Time Taken " + f);
		

	}

}
