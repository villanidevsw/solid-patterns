package domain.bad;

import java.util.Date;

public class CustomerTransaction {
	//classe com muitas responsabilidades
	// deixando as classes que dependem dela com alto acoplamento
	
	//metodos para report
	public String getName(){
		return "name";
	}
	
	public Date getDate(){
		return new Date();
	}
	
	public String getProductBreakdown(){
		return "detailed list for report";
	}
	
	//metodos para recebimento
	public void prepareInvoice(){
		System.out.println("invoice prepared...");
	}
	
	public void chargeCustomer(){
		System.out.println("charged customer...");
	}
}
