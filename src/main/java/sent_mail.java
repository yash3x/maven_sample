import org.apache.commons.mail.EmailException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class sent_mail extends email_simple {
    @AfterMethod
    public void sendingReport(ITestResult result) throws EmailException {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Sending the test result now!");
            sendemail();
        }
    }
}
