public class Adminstrators extends Staff {
	private String role;

	public Adminstrators(String firstName, String lastName, String nationalNumber, String email, double salary,
			String departement, String contactNumber, double shiftHours, double officeNumber, String role) {

		super(firstName, lastName, nationalNumber, email, salary, departement, contactNumber, shiftHours, officeNumber);

		this.role = role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {

		return super.toString() + "Role: " + role + "\n";
	}

}
