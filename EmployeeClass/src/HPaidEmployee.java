
public class HPaidEmployee extends EmployeeClass{

	private int hours;
	private double rate;

	public HPaidEmployee (String name, int hours, double rate) {
		super (name);
		this.hours = hours;
		this.rate = rate;
	}

	public String toString() {
		return "HPaidEmployee Hours=" + hours + " Rate=" + rate + " Salary=" + this.calculateSalary() + " Name=" + super.getName();
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + hours*rate;
	}
	
	
	
}
