package subjects;

import domain.Customer;

public interface CoffeeSubject {
	
	public void registerObserver(Customer observer);
	public void unregisterObserver(Customer observer);
	public void notifyObservers(String drink);
}
