package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Case2 extends Login{
	
  @Test
  public void Mction() {
	  
	 driver.findElement(By.xpath(".//*[@id='wrap']/div[1]/div/div[2]/ul[1]/li[1]/a")).click();
	  
	   
	   
	  
	  
	  
	  
	  
  }
}
