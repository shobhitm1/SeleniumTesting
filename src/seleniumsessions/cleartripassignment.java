package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartripassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		System.out.println("Cleartrip website is open now");
		driver.findElement(By.id("DepartDate")).click();
		
		
		
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Selected current date");
		WebElement adults = driver.findElement(By.id("Adults"));
		Select s = new Select(adults);
		s.selectByIndex(2);
		System.out.println("2 adults are going");
		WebElement child = driver.findElement(By.id("Childrens"));
		Select s1 = new Select(child);
		s1.selectByIndex(2);
		
		System.out.println("And 2 children");
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println("Searching begins here");
		//validate error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
		
		

	}

}
