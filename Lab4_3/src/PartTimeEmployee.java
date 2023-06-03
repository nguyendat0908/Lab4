
public class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	public PartTimeEmployee(String name,int age,String gender,String employerName,String dateString,int hoursPerWeek) {
		super(name, age, gender, employerName, dateString);
		this.hoursPerWeek=hoursPerWeek;
	}
	public PartTimeEmployee() {
	}
	public int gethoursPerWeek() {
		return hoursPerWeek;
	}
	public void sethoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek= hoursPerWeek;
	}
	@Override
	public String toString() {
		return super.toString()+"\nHoursPerWeek= "+hoursPerWeek;
	}
}