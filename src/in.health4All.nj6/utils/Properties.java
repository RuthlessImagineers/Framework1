import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Arun1919 on 29-12-2016.
 */
public class Properties {



    public static void driver_properties(WebDriver driver){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun1919\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        return ;


    }

}
