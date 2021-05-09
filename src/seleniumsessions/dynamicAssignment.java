package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.htmlelements.element.Select;

public class dynamicAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"));
		String value = option.getText().trim();
		System.out.println(value);
		WebElement drop = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select sel = new Select(drop);
		sel.selectByVisibleText(value);
		driver.findElement(By.name("enter-name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(value)) {
			System.out.println("It contains the entered value");
		} else {
			System.out.println("Does not contain the entered value");
		}
		

	}

}
