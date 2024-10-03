public class Students extends Person {

	private int level;
	private double GPA;

	public Students(String firstName, String lastName, String nationalNumber, String email, int level, double GPA) {
		super(firstName, lastName, nationalNumber, email);

		if (level >= 1 && level <= 4) {

			this.level = level;
		}

		if (GPA >= 0 && GPA <= 4) {
			this.GPA = GPA;
		}

	}

	public void setLevel(int level) {
		if (level >= 1 && level <= 4) {

			this.level = level;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setGPA(double GPA) {
		if (GPA >= 0 && GPA <= 4) {
			this.GPA = GPA;
		}
	}

	public double getGPA() {
		return GPA;
	}

	@Override
	public String toString() {

		return super.toString() + "Level: " + level + "\n" + "GPA: " + GPA + "\n";
	}

}
