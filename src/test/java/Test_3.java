import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_3 extends sent_mail {

    @Test(groups = {"regression"})
    public void LogIn() {
        System.out.println("This is Test_1");
        Assert.assertEquals("A", "B");
    }
}
