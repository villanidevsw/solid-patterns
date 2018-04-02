package system;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import observers.WaitingCustomer;
import subjects.CoffeeSubject;

public class CoffeeAttendent implements CoffeeSubject {
	
	private List<Customer> waitingCustomers;
	private List<String> completedDrinks;
		
	public CoffeeAttendent() {
		waitingCustomers = new ArrayList<Customer>();
        completedDrinks = new ArrayList<String>();
	}

	@Override
	public void registerObserver(Customer observer) {
		waitingCustomers.add(observer);

	}

	@Override
	public void unregisterObserver(Customer observer) {
		waitingCustomers.remove(observer);

	}

	@Override
	public void notifyObservers(String drink) {
		waitingCustomers.forEach(customer->{
			if (customer.isOrderedDrink(drink)) {
				customer.orderReady(drink);
				unregisterObserver(customer);
			}
			
			});
		
	}
	
	public void takeOrder(Customer customer){
		waitingCustomers.add(customer);
		System.out.println("Coffee Attendent: '" + customer.getName()
        + ", I've started working on your order of " + customer.getDrinkOrdered() + "'");		
	}
	
	public void prepareDrink(String drinkToPrepare){
		double timeTaken = Math.random()* 10;
		try {
			
			Thread.sleep((long) (timeTaken * 1000));
			completedDrinks.add(drinkToPrepare);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void callOutCompletedOrders(){		
		completedDrinks.forEach(drink ->{
			System.out.println("Drink ready: "+drink);
			notifyObservers(drink);
		});
	}
}
