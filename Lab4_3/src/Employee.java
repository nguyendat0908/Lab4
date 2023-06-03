
public class Employee extends Person{
	private String employerName,dateHired;

	public Employee(String name, int age, String gender, String employerName, String dateHired) {
		super(name, age, gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}

	public Employee() {
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return super.toString()+"\nemployerName=" + employerName + "\ndateHired=" + dateHired;
	}
	
	
	
}