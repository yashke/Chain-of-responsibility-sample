
public class ArchiveHandler extends Handler {
	MailStorage storage;
	
	public ArchiveHandler(MailStorage storage) {
		this.storage = storage;
	}
	
	@Override
	public void processMail(Mail mail) {
		storage.addMail(mail);
	}

}
