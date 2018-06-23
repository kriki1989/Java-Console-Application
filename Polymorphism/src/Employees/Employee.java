package Employees;

public abstract class Employee implements Payable {
	private String name;
	private String surname;
	private String id;
	private String insuranceBody;
	private String jobDesc;
	
	public Employee() {
	}
	
	public Employee(String name, String surname, String id, String insuranceBody, String jobDesc) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.insuranceBody = insuranceBody;
		this.jobDesc = jobDesc;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getId() {
		return id;
	}
	public String getInsuranceBody() {
		return insuranceBody;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setInsuranceBody(String insuranceBody) {
		this.insuranceBody = insuranceBody;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", id=" + id + ", insuranceBody=" + insuranceBody
				+ ", jobDesc=" + jobDesc + "]";
	}
	
	
	
	
}
