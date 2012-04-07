
public class OrderHandler extends Handler {
	MailStorage storage;
	
	public OrderHandler(MailStorage storage) {
		this.storage = storage;
	}
	
	@Override
	protected void processMail(Mail mail) {
		if (orderPredicate(mail)) {
			storage.addMail(mail);
		}
	}
	
	private boolean orderPredicate(Mail mail) {
		boolean isSatisfied = false;
		isSatisfied = isSatisfied || mail.getContent().matches("/order/");
		isSatisfied = isSatisfied || mail.getTitle().matches("/order/");
		return isSatisfied;
	}
}
