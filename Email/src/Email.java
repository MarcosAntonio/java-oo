import javax.mail.Authenticator;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class Email 
{
	public static void main (String[] agrs) throws EmailException
	{
		
		String meuemail = "marcostrumpet99@gmail.com";
		String nome = "Desafio";
		
		SimpleEmail email = new SimpleEmail();
		email.setSSLOnConnect(true);
		email.setHostName("smtp.gmail.com");
		email.setSslSmtpPort("465");
		email.setFrom(meuemail, nome);
		email.setAuthentication("marcostrumpet99@gmail.com", "senha");;
		email.addTo("socram_marcos2010@hotmail.com");
		email.addCc("marcostrumpet99@gmail.com");
		email.setSubject("E-mail desafio");
		email.setMsg("Missão dada é missão comprida! Sendo que usei outra API, a Commons E-mail API. \nSim essa API é do apache.");
		email.send();
		
	}
}
