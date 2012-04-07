
public class ComplaintHandler extends Handler {
	MailStorage storage;
	
	public ComplaintHandler(MailStorage storage) {
		this.storage = storage;
	}

	@Override
	protected void processMail(Mail mail) {
		if (complaintPredicate(mail)) {
			storage.addMail(mail);
		}
	}
	
	private boolean complaintPredicate(Mail mail) {
		boolean isSatisfied = false;
		isSatisfied = isSatisfied || mail.getContent().matches("/bad/");
		isSatisfied = isSatisfied || mail.getTitle().matches("/bad/");
		return isSatisfied;
	}

}
