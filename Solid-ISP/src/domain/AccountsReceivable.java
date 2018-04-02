package domain;

public class AccountsReceivable {
	
	// esta classe agora depende apenas da interface
	Accounting customerTransaction;
	
	public AccountsReceivable(Accounting customerTransaction) {
		this.customerTransaction = customerTransaction;
	}
	
	public void postPayment(){
		customerTransaction.chargeCustomer();
	}
	
	public void sendInvoice(){
		customerTransaction.prepareInvoice();
	}
}
