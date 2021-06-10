package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapButtonClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url=driver.getTitle();
		System.out.println(url);
		driver.findElement(By.id("btnDropdownDemo")).click();
		List<WebElement> ele= driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		int size=ele.size();
		System.out.println("Options are " + size);
		for(WebElement opt : ele) {
			System.out.println(opt.getText());
			if(opt.getText().equalsIgnoreCase("CSS")) {
				opt.click();
				System.out.println("Clicked Option is " + opt);
				break;
			}
		}
		
		//driver.findElement(By.linkText("CSS")).click();
		
		System.out.println("New Page Title is " + driver.getTitle());
		

	}

}
