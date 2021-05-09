package Testingng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
@Test
public class globalTest {
	public static void main(String args[]) throws IOException {
	
	Properties prop =new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Shobhit\\eclipse-workspace\\SeleniumWork\\src\\Testingng\\example.properties");
	prop.load(fis);	
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("URL"));
	prop.setProperty("browser","firefox");
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Shobhit\\eclipse-workspace\\SeleniumWork\\src\\Testingng\\example.properties");
	prop.store(fos, null);
	
}
}
