
public class Client {
	private MailStorage presidentStorage = new MailStorage();
	private MailStorage archiveStorage = new MailStorage();
	private MailStorage lawyersStorage = new MailStorage();
	private MailStorage tradeStorage = new MailStorage();
	private MailStorage marketingStorage = new MailStorage();
	Handler handler;
	
	public Client() {
		handler = new ArchiveHandler(archiveStorage);
		handler.addNextHandler(new CommendationHandler(presidentStorage));
		handler.addNextHandler(new ComplaintHandler(lawyersStorage));
		handler.addNextHandler(new OrderHandler(tradeStorage));
		handler.addNextHandler(new OtherHandler(marketingStorage));
	}
	
	public void handleEmail(Mail mail) {
		handler.process(mail);
	}
}
