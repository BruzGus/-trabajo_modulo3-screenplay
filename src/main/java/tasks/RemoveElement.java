package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.AddElementUI;
import ui.RemoveElementUI;

public class RemoveElement {
    private WebDriver webDriver;

    public RemoveElement(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static boolean remove(WebDriver driver) {
        Click.on(driver, RemoveElementUI.RemoveElement);
        return true;
    }
}
