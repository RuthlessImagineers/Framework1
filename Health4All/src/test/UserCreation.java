package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserCreation extends Login {
	
	public void newuser(){
				
		Actions builder = new Actions(driver);
		WebElement Resourcesmenue = driver.findElement(By.xpath(".//ul[@class='nav navbar-nav']/li[3]/a"));
		Resourcesmenue.click();
		builder.moveToElement(Resourcesmenue).build().perform();
		WebElement Resourcesubmenue = driver.findElement(By.xpath(".//a[@href='/health4all_test/staff/add/staff']"));
		builder.moveToElement(Resourcesubmenue).build().perform();
		Resourcesubmenue.click();
	}
	
	

}
