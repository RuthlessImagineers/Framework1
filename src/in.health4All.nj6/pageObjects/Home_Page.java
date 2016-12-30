import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Home_Page {

    private static WebElement element = null;

    public static WebElement lnk_MyAccount(WebDriver driver)  {



        element = driver.findElement(By.xpath(".//h2//a[text()='Health4all']"));
        element.click();

        return element;
    }

     public static WebElement lnk_LogOut(WebDriver driver)  {

        element=driver.findElement(By.xpath("//li//a[text()='admin ']"));


        element=driver.findElement(By.partialLinkText("logout"));

        return element;



    }


    }


