package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    String messg = "Dupa 123";

    MessageUtil msg = new MessageUtil(messg);

    @Test
    public void testWydrugku () {
        Assert.assertEquals(messg, msg.printMessage());
    }


}
