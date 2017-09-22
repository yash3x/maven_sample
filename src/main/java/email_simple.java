import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class email_simple {
    public static void main(String[] args) throws EmailException {

        System.out.println("Sending an email now!");
        sendemail();
        System.out.println("Email sent!");
    }

    static void sendemail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("humbleautomator", "inception"));
        email.setSSLOnConnect(true);
        email.setFrom("humbleautomator@gmail.com");
        email.setSubject("Test report");
        email.setMsg("Hi. Your test report!");
        email.addTo("yashwant.das@diagnal.com");
        email.send();
    }
}
