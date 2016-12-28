package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.Test;

import BaseFiles.BaseClassOne;
//import BaseFiles.OpeningBrowser;

public class Login extends BaseClassOne  {
	
		
	@Test
	public void Logincase() throws IOException{
		
		//openbrowser();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Arun1919\\git\\Health4All\\Health4All\\src\\datadriver.properties");
		prop.load(fis);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(".//*[@id='wrap']/div[2]/div/form/button")).click();
		  System.out.println(driver.getTitle());
		
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\Users\\Arun1919\\workspace\\1stFrameWork\\ScreenShots\\login.jpg"));
			
		  System.out.println("Screenshot captured");
	}
	
	//@Test
	public void Mction() throws IOException {
		  
		  
		 driver.findElement(By.xpath(".//*[@id='wrap']/div[1]/div/div[2]/ul[1]/li[1]/a")).click();
		  
		 
		  
		  File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot2,new File("C:\\Users\\Arun1919\\workspace\\1stFrameWork\\ScreenShots\\click.jpg")); 
		  
	
	

}
}
