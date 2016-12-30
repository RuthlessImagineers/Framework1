import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Arun1919 on 29-12-2016.
 */
public class Login_Page {
    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver) {
        element = driver.findElement(By.cssSelector("input[name='username']"));
        Log.info("Username text box found");
        return element;
    }

    public static WebElement txtbx_PassWord(WebDriver driver) {
        element = driver.findElement(By.cssSelector("input[name='password']"));
        Log.info("Password text found");
        return element;
    }

    public static WebElement btn_SignIn(WebDriver driver){
        element = driver.findElement(By.cssSelector("button[type='submit']"));
        Log.info("Submit button found");
        return element;


    }
}
