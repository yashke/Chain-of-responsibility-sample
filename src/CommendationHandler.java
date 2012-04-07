
public class CommendationHandler extends Handler {
	MailStorage storage;
	
	public CommendationHandler(MailStorage storage) {
		this.storage = storage;
	}

	@Override
	protected void processMail(Mail mail) {
		if (commendationPredicate(mail)) {
			storage.addMail(mail);
		}
	}
	
	private boolean commendationPredicate(Mail mail) {
		boolean isSatisfied = false;
		isSatisfied = isSatisfied || mail.getContent().matches("/cool/");
		isSatisfied = isSatisfied || mail.getTitle().matches("/cool/");
		return isSatisfied;
	}
}
