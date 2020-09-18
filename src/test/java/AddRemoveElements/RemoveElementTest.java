package AddRemoveElements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.AddElement;
import tasks.Examples;
import tasks.RemoveElement;

public class RemoveElementTest extends BaseTest {
    @Test
    public void removeElements(){

        AddElement addElement = Examples.addElement(webDriver);
        RemoveElement removeElement = Examples.removeElement(webDriver);
        Assert.assertTrue(removeElement.remove(webDriver),"Hubo problemas en el proceso Login");

    }

}
