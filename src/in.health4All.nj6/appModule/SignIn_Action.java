import org.openqa.selenium.WebDriver;

/**
 * Created by Arun1919 on 29-12-2016.
 */
public class SignIn_Action {

    public static void Execute(WebDriver driver) throws Exception {
        String sUserName = ExcelUtils.getCellData(1,1);
        Log.info("Username picked from Excel is" +sUserName);
        String sPassword = ExcelUtils.getCellData(1,2);
        Log.info("Password picked from Excel is" +sPassword);


        //Home_Page.lnk_MyAccount(driver);
        Login_Page.txtbx_UserName(driver).sendKeys(sUserName);
        Log.info("Username entered in username box ");
        Login_Page.txtbx_PassWord(driver).sendKeys(sPassword);
        Log.info("Password entered in password box");
        Login_Page.btn_SignIn(driver).click();
        Log.info("Click action performed on signin");


    }

}
