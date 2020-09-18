package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetText {
    public static String on(WebDriver webDriver, By locator){
        return webDriver.findElement(locator).getText().trim();
    }
}
