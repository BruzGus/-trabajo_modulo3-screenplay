package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.AddElementUI;

public class AddElement {
    private WebDriver webDriver;

    public AddElement(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static boolean add(WebDriver driver) {
        Click.on(driver, AddElementUI.addElement);
        return true;
    }
}
