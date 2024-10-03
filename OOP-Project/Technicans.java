public class Technicans extends Staff {
	
	private String specialization;

	public Technicans(String firstName, String lastName, String nationalNumber, String email, double salary,
			String departement, String contactNumber, double shiftHours, double officeNumber,String specialization) {
		super(firstName, lastName, nationalNumber, email, salary, departement, contactNumber, shiftHours, officeNumber);
		
		this.specialization=specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Specialization: "+specialization+"\n";
	}

}
