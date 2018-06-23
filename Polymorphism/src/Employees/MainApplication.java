package Employees;

public class MainApplication {


	public static void main(String[] args) {
		Employee employee1 = new HourlyEmployee ("Ioannis", "Lilimpakis", "1", "Eurobank", "Programmer", 400, 5);
		Employee employee2 = new SalaryEmployee ("Maria", "Karida", "2", "Eurobank", "Programmer", 1200);
		System.out.println(employee1.toString()+"\n" + employee2.toString());
		
		employee2=employee1;
		System.out.println("\n" + employee1.toString()+"\n" + employee2.toString());
		
		
	}

}
