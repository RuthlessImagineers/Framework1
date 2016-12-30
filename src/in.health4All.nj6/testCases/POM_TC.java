import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class POM_TC {

    private static WebDriver driver = null;

    public static void  main(String[] args) throws InterruptedException {

        //Properties.driver_properties(driver);

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun1919\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.get("http://code4community.in/");

        Home_Page.lnk_MyAccount(driver);
        Login_Page.txtbx_UserName(driver).sendKeys("admin");
        Login_Page.txtbx_PassWord(driver).sendKeys("password");
        Login_Page.btn_SignIn(driver).click();
        System.out.println("Login Successfully");
        //Home_Page.lnk_LogOut(driver).click();




    }
}
