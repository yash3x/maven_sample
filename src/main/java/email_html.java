import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

class email_html {
    public static void main(String[] args) throws EmailException {

        // Create the email message
        HtmlEmail email = new HtmlEmail();

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("humbleautomator", "inception"));
        email.setSSLOnConnect(true);
        email.setFrom("humbleautomator@gmail.com");
        email.setSubject("Test report");
        email.setMsg("Hi. Your test report!");
        email.addTo("yashwant.das@diagnal.com");

        // set the html message
        email.setHtmlMsg("");

        // send the email
        email.send();
    }
}
