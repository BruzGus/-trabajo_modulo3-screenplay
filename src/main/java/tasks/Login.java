package tasks;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.LoginUI;

public class Login {
    private WebDriver webDriver;

    public Login (WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public static SecureArea as(WebDriver webDriver,String user, String pass){
        Enter.text(webDriver, LoginUI.userName,user);
        Enter.text(webDriver,LoginUI.password,pass);
        ReportManager.getInstance().getTest().log(Status.INFO,"se ingresa usuario y contraseña");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver,Status.INFO,"Login");
        Click.on(webDriver,LoginUI.login);
        return new SecureArea(webDriver);
    }
}
