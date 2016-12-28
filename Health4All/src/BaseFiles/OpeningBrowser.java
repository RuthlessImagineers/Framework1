package BaseFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpeningBrowser {
	public WebDriver driver = null;
	
	@BeforeTest
	public void BrowserOpen() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Arun1919\\workspace\\1stFrameWork\\src\\datadriver.properties");
		prop.load(fis);
		
		//calling a browser 
		if(prop.getProperty("browser").equals("firefox")){
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun1919\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else if(prop.getProperty("browser").equals("chrome")) {
			 driver = new ChromeDriver();
			
				
		}
		//calling a url
		driver.get(prop.getProperty("url"));
				
			
	}
	

		
		
	
	
	
	

}
