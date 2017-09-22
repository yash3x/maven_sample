import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_1 extends sent_mail {

    @Test(groups = {"basic"})
    public void LogIn() {
        System.out.println("This is Test_1");
        Assert.assertEquals("A", "A");
    }
}
