package Employees;

public class SalaryEmployee extends Employee{
	
	private double salary;

	public SalaryEmployee() {
	}
	
	public SalaryEmployee(String name, String surname, String id, String insuranceBody, String jobDesc, double salary) {
		super(name, surname, id, insuranceBody, jobDesc);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + ", Name=" + getName() + ", Surname="
				+ getSurname() + ", Id=" + getId() + ", InsuranceBody=" + getInsuranceBody()
				+ ", Job Description=" + getJobDesc() + "]";
	}
	
	public double pay() {
		return this.salary;
	}
	
	
}
