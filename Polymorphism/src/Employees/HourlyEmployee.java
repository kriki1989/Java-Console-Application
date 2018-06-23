package Employees;

public class HourlyEmployee extends Employee{
	private int hours;
	private double rate;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(String name, String surname, String id, String insuranceBody, String jobDesc, int hours, double rate) {
		super (name, surname, id, insuranceBody, jobDesc);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [Salary=" + hours*rate + ", Name=" + getName() + ", Surname="
				+ getSurname() + ", Id=" + getId() + ", InsuranceBody=" + getInsuranceBody()
				+ ", Job Description=" + getJobDesc() + "]";
	}
	
	public double pay() {
		double sum = this.hours*this.rate;
		return sum;
	}

}
