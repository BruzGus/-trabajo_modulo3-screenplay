package AddRemoveElements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.AddElement;
import tasks.Examples;

public class AddElementsTest extends BaseTest {
    @Test
    public void AddElements(){

        AddElement addElement = Examples.addElement(webDriver);
        Assert.assertTrue(addElement.add(webDriver),"Hubo problemas en el proceso Login");

    }

}