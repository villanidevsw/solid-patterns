package management;

import domain.Doctor;
import domain.Employee;
import domain.Nurse;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagement director = new HospitalManagement();
		Employee joao = new Nurse(1, "Joao", "emergencia", true);

		director.callUpon(joao);

		Employee maria = new Doctor(2, "Maria", "emergencia", true);

		director.callUpon(maria);
	}
}
