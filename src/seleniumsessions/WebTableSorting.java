package seleniumsessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSorting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
		
		List<WebElement> alist=driver.findElements(By.xpath("//tr/td[1]"));
		
		
		List newlist= alist.stream().map(x->x.getText()).collect(Collectors.toList());
		
		newlist.stream().sorted().forEach(a->System.out.println(a));
		
		
		//scan the name column with getText and print the price of corresponding commodity
		List<String> price;
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		 price=rows.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println("Value is:- "+a));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();	
		}
		}while(price.size()<1);
		
	}

	private static String getPriceVeggie(WebElement s) 
	{
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
		// TODO Auto-generated method stub
		
	}

}
