package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		//grab the common attribute //put it into list
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//input[@id='travel_date']")).isSelected());
		WebElement arrow =driver.findElement(By.xpath("//th[contains(text(),'September 2020')]"));
		while(!arrow.getText().contains("October")) {
			driver.findElement(By.cssSelector("[class='datepicker-days' ]  th[class='next']")).click();
		}
		
		
		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}

		}
		
		
		

	}

}
