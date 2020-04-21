package br.com.alura.emviadoEmail.enviadorEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {

	public void enviar(String nome,String destinatario) {
		try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("anaalice.cd@gmail.com", "G1sl3n3S2"));
            email.setSSLOnConnect(true);

            email.setFrom("anaalice.cd@gmail.com");
            email.setSubject("Você foi convidado pelo ListaVIP");
            email.setMsg("Olá " + nome + ". Você acaba de ser convidado pelo ListaVIP.");
            email.addTo(destinatario);
            email.send();

        } catch (EmailException e) {
            e.printStackTrace();
        }
		
	}
}
