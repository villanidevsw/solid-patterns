package domain;

import observers.WaitingCustomer;

public class Customer implements WaitingCustomer {
	private String name;
	private String drinkOrdered;
	
	public Customer(String name,String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDrinkOrdered() {
		return drinkOrdered;
	}
	public void setDrinkOrdered(String drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", drinkOrdered=" + drinkOrdered + "]";
	}
	

	@Override
	public void orderReady(String preparedDrink) {
		if (isOrderedDrink(preparedDrink)) {
			System.out.println("I'm "+name);
			System.out.println("My drink: " + preparedDrink + " has been prepared...I'm leaving");
		}
		
	}
	
	public boolean isOrderedDrink(String preparedDrink) {		
		return preparedDrink.equalsIgnoreCase(drinkOrdered);
	}
	
	
}
