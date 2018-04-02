package domain;

public class PortugueseTeacher extends SchoolStaff implements CourseInstructor {

	@Override
	public void teach() {
		System.out.println("teaching portuguese...");
		
	}

}
