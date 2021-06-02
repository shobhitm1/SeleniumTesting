package seleniumsessions;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadPDFScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory", "C:\\Users\\Shobhit\\Downloads");
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Download PDF")).click();
		Thread.sleep(1000);
		String path ="C:\\Users\\Shobhit\\Downloads";
		File availablefiles= new File(path);
		
		File[] listfiles=availablefiles.listFiles();
		String s="testleaf.pdf";
		for(File fil : listfiles){
			if(fil.getName().equalsIgnoreCase(s)) {
				System.out.println(" File has been Downloaded Successfully");
			}
			else {
				System.out.println("File not downloaded yet ");
			}
		
	}

}
	}