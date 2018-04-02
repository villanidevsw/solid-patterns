package domain;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting,Reporting {
	//classe teve a segregação das funções pelas interfaces
	
	private List<Product> products;
	private Customer customer;
		
	public CustomerTransaction(List<Product> products, Customer customer) {
		this.products = products;
		this.customer = customer;
	}
	@Override
	public String getName(){
		return this.customer.getName();
	}
	@Override
	public Date getDate(){
		return new Date();
	}
	@Override
	public String getProductBreakdown(){
		return products.toString();
	}
	
	@Override
	public void prepareInvoice(){
		System.out.println("invoice prepared...");
	}
	
	@Override
	public void chargeCustomer(){
		System.out.println("charged customer...");
	}
}
