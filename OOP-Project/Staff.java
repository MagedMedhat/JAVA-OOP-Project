public class Staff extends Person {

	private double salary;
	private String departement;
	private String contactNumber;
	private double shiftHours;
	private double officeNumber;

	public Staff(String firstName, String lastName, String nationalNumber, String email, double salary,
			String departement, String contactNumber, double shiftHours, double officeNumber) {
		super(firstName, lastName, nationalNumber, email);

		if (salary > 0) {
			this.salary = salary;
		}

		this.departement = departement;
		this.contactNumber = contactNumber;
		if (shiftHours > 0) {
			this.shiftHours = shiftHours;
		}
		this.officeNumber = officeNumber;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}

	}

	public double getSalary() {
		return salary;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getDepartement() {
		return departement;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setShiftHours(double shiftHours) {
		if (shiftHours > 0) {
			this.shiftHours = shiftHours;
		}
	}

	public double getShiftHours() {
		return shiftHours;
	}

	public void setOfficeNumber(double officeNumber) {
		this.officeNumber = officeNumber;
	}

	public double getOfficeNumber() {
		return officeNumber;
	}

	@Override
	public String toString() {

		return super.toString() + "Salary: " + salary + "\n" + "Departement: " + departement + "\n" + "Contact Number: "
				+ contactNumber + "\n" + "Shift Hours: " + shiftHours + "\n" + "Office Number: " + officeNumber + "\n";

	}

}
