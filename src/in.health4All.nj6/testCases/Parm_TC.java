import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Arun1919 on 29-12-2016.
 */
public class Parm_TC {
    private static WebDriver driver = null;

    @BeforeMethod
    public static void beforMethod() throws Exception {

        //Properties.driver_properties(driver);
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");
        ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, "Sheet1");
        Log.info("Excel opened");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun1919\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        Log.info("Driver intiated");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Log.info("Implicit wait applied on the driver for 10 seconds");
        //driver.get("http://code4community.in/");
        driver.get(Constants.url);
        Log.info("WebSite launched");
    }
     @Test
     public void main() throws Exception {
            SignIn_Action.Execute(driver);
            System.out.println("Loginsucessfull through module framework");
        }
     @AfterMethod
      public void afterMethod() throws Exception {
         driver.quit();
         ExcelUtils.setCellData("Pass", 1, 3);
     }
    }

