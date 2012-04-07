import java.util.ArrayList;


public class MailStorage {
	ArrayList<Mail> container;
	
	public MailStorage() {
		container = new ArrayList<Mail>();
	}
	
	public void addMail(Mail mail) {
		container.add(mail);
	}
}
