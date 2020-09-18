package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.ExamplesUI;

public class Examples {
    public static Login formAuthentication(WebDriver webDriver){
        ReportManager.getInstance().getTest().log(Status.INFO,"ingresamos al formulario");
        Click.on(webDriver,ExamplesUI.formAuthentication);
        return new Login(webDriver);
    }
    public static AddElement addElement(WebDriver webDriver){
        ReportManager.getInstance().getTest().log(Status.INFO,"ingresamos al sitio Add/Remove Elements");
        Click.on(webDriver,ExamplesUI.addRemoveElements);
        return new AddElement(webDriver);
    }
    public static RemoveElement removeElement(WebDriver webDriver){
        ReportManager.getInstance().getTest().log(Status.INFO,"ingresamos al sitio Add/Remove Elements");
        Click.on(webDriver,ExamplesUI.addRemoveElements);
        return new RemoveElement(webDriver);
    }

}
