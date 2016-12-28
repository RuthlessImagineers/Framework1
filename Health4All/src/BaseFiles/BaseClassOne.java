package BaseFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassOne {
	
	public WebDriver driver = null;

  @BeforeSuite
  public void openbrowser(){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun1919\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.get("http://code4community.in/health4all_test/");
  }
  
  @AfterSuite
  public void closebrowser(){
	  System.out.println("Browser close");
	  driver.quit();
  }
	
  }
