package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tableexercies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		int sum=0;
		System.out.println("Enter code");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();		
		System.out.println(count);
		for(int i=0;i<count-2;i++) {
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int intvalue=Integer.parseInt(value);
			sum=sum+intvalue;	
		}
		System.out.println("Total sum is"+" "+sum);
		System.out.println("Totla extras"+" "+driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		String extraas= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extras=Integer.parseInt(extraas);
		System.out.println("Sum including Extras:- "+" "+ (extras+sum));
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		System.out.println("Exit code");
		}
		
	}


