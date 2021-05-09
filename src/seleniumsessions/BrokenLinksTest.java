package seleniumsessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynnamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		SoftAssert a =new SoftAssert();
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links and images"+ "-->"+ linkslist.size());
		List<WebElement> activeLinks =new ArrayList<WebElement>();
		//2 Iterate the LinkList
		for(int i=0;i<linkslist.size();i++) {
			System.out.println(linkslist.get(i).getAttribute("href") );
			if(linkslist.get(i).getAttribute("href")!=null && !linkslist.get(i).getAttribute("href").contains("javascript")) {
				activeLinks.add(linkslist.get(i));
			}
		}
		System.out.println("Size of active links and images"+ "-->"+ activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			HttpURLConnection connect = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connect.connect();
			String message=connect.getResponseMessage();
			connect.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+message);
			}
	}

}
