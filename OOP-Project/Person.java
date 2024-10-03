import java.io.Serializable;

public abstract class Person implements Serializable {

	private String firstName;
	private String lastName;
	private String nationalNumber;
	private String email;
	
	
	public Person(String firstName,String lastName,String nationalNumber,String email ) {
		
		this.firstName=firstName;
		this.lastName=lastName; 
		this.nationalNumber=nationalNumber;
		this.email=email;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber=nationalNumber;
	}
	
	public String getNationalNumber() {
		
		return nationalNumber;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		
		return "First Name: "+ firstName+"\n"+"Last Name: "+lastName+"\n"+"National Number: "+nationalNumber+"\n"+"Email: "+email+"\n";
				
	}
	
	
	
	
	
}
