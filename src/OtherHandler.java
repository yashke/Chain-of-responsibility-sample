
public class OtherHandler extends Handler {
	MailStorage storage;
	
	public OtherHandler(MailStorage storage) {
		this.storage = storage;
	}
	
	@Override
	protected void processMail(Mail mail) {
		if (otherPredicate(mail)) {
			storage.addMail(mail);
		}
	}
	
	private boolean otherPredicate(Mail mail) {
		boolean isSatisfied = false;
		isSatisfied = isSatisfied || mail.getContent().matches("/other/");
		isSatisfied = isSatisfied || mail.getTitle().matches("/other/");
		return isSatisfied;
	}
}
