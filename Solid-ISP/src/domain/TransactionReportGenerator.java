package domain;

public class TransactionReportGenerator {
	// esta classe agora depende apenas da interface
	Reporting customerTransaction;

	public TransactionReportGenerator(Reporting customerTransaction) {
		this.customerTransaction = customerTransaction;
	}

	public String generateReport() {
		return customerTransaction.getName() + ", " + customerTransaction.getDate() + ", "
				+ customerTransaction.getProductBreakdown();
	}

}
