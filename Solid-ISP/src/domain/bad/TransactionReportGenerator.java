package domain.bad;

public class TransactionReportGenerator {
	// esta classe usa apenas 3 metodos da customer transaction
		// customer transaction possui muitas responsabilidades
		// e transactionReportGenerator sabe de muitos detalhes que nao sao da sua "conta"
	CustomerTransaction customerTransaction;
	
	public TransactionReportGenerator(CustomerTransaction customerTransaction) {
		this.customerTransaction = customerTransaction;
	}
	
	public String generateReport(){
		return customerTransaction.getName()+", "+customerTransaction.getDate();
	}
	
}
