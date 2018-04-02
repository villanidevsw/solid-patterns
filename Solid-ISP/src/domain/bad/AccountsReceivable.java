package domain.bad;

public class AccountsReceivable {
	
	// esta classe usa apenas 2 metodos da customer transaction
	// customer transaction possui muitas responsabilidades
	// e accountsReceivable sabe de muitos detalhes que nao sao da sua "conta"
	CustomerTransaction customerTransaction;
	
	public AccountsReceivable(CustomerTransaction customerTransaction) {
		this.customerTransaction = customerTransaction;
	}
	
	public void postPayment(){
		customerTransaction.chargeCustomer();
	}
	
	public void sendInvoice(){
		customerTransaction.prepareInvoice();
	}
}
