import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("ma.bi0110", "Bulkaimaslo2502!@"));
        email.setSSLOnConnect(true);
        email.setFrom("ma.bi0110@interia.pl");
        email.setSubject("Siemaa");
        email.setMsg("Ucze sie javy");
        email.addTo("ma.bi0110@interia.pl");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}