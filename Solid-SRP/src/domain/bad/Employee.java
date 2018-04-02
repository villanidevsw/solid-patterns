package domain.bad;

public class Employee {
	// classe que representa um design ruim que viola o SRP

	private Long id;
	private String name;
	private String department;
	private boolean working;

	public void saveToDatabase(Employee employee) {

	}

	public void printDetailReportXML(Employee employee) {

	}
	
	public void printDetailReportCSV(Employee employee) {

	}

	public void terminateEmployee(Employee employee) {

	}

}
