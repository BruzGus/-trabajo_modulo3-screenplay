package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Examples;
import tasks.Login;
import tasks.SecureArea;

public class LoginTest extends BaseTest {
    @Test
    public void testSuccessFullLogin(){
        String message;
        Login login = Examples.formAuthentication(webDriver);
        SecureArea secureArea = login.as(webDriver,"tomsmith","SuperSecretPassword!");
        //SecureArea secureArea = login.as(webDriver,"admin","admin123");
        Assert.assertTrue(secureArea.visible(webDriver),"Hubo problemas en el proceso Login");
        message = secureArea.getText(webDriver).replace('×', ' ').trim();
        Assert.assertEquals(message,"You logged into a secure area!");
    }

}
