public class Inatractors extends Staff {

	private String course;

	public Inatractors(String firstName, String lastName, String nationalNumber, String email, double salary,
			String departement, String contactNumber, double shiftHours, double officeNumber, String course) {

		super(firstName, lastName, nationalNumber, email, salary, departement, contactNumber, shiftHours, officeNumber);

		this.course = course;

	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	@Override
	public String toString() {

		return super.toString() + "Course: " + course + "\n";
	}

}
