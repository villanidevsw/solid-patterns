package observerpattern;

import domain.Employee;

public interface IObserver {
	
	public void callMe(Employee employee,String msg);
}
