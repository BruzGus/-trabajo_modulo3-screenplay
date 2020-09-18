package tasks;

import actions.GetText;
import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;
import ui.SecureAreaUI;

public class SecureArea {
    private WebDriver webDriver;

    public SecureArea (WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public static boolean visible (WebDriver webDrive){
        return IsDisplayed.element(webDrive, SecureAreaUI.loginSuccess);
    }

    public static String getText(WebDriver webDriver){
        return GetText.on(webDriver,SecureAreaUI.loginSuccess);
    }
}
