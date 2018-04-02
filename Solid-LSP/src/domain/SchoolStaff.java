package domain;

public class SchoolStaff {
	private String name;

	private void makeAnnoucements() {
		System.out.println("teaching portuguese...");
	}

	private void takeAttendence() {
		System.out.println("teaching portuguese...");
	}

	private void collectPaperWork() {
		System.out.println("teaching portuguese...");
	}

	private void conductHallwayDuties() {
		System.out.println("teaching portuguese...");
	}

	public void performOtherResponsibilities() {
		makeAnnoucements();
		takeAttendence();
		collectPaperWork();
		conductHallwayDuties();
	}
}
