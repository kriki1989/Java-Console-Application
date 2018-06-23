import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTestList {
	static Scanner scanner = new Scanner (System.in);
	static Employee[] employeeArray = new Employee[4];//rray that stores Employees
	static ArrayList<Employee> employeeList = new ArrayList<>();
	public static void main (String args[]){
		Employee myEmp1 = new Employee("Maria", 1000);
		Employee myEmp2 = new Employee("Ioannis", 800);
		Employee myEmp3 = new Employee("Sofia", 1200);
		/* employeeArray[0] = myEmp1;
        employeeArray[1] = myEmp2;
        employeeArray[2] = myEmp3;*/
		employeeList.add(myEmp1);
		employeeList.add(myEmp2);
		employeeList.add(myEmp3);
		createMenu();
	}
	private static void createMenu() {

		int choice=0;

		do{
			System.out.println("\n    **Menu**    ");
			System.out.println("1. Print Employees");
			System.out.println("2. Create new Employee");
			System.out.println("3. Give raise");
			System.out.println("4. Remove employee");
			System.out.println("5. Print Employee with salary limit");
			System.out.print("Make your choice: ");
			choice = scanner.nextInt();
			System.out.println("");

			if(choice==1){
				printEmployees(1);
			}
			else if(choice==2){
				createNewEmployee();
			}
			else if(choice==3){
				giveRaise();
			}
			else if (choice==4){
				removeEmployee();
			}
			else if (choice==5){
				printEmployees(5);
			}
		}
		while(choice!=-1);
	}

	private static void printEmployees(int choice) {
		boolean found=false;
		if (choice==1){
			System.out.println("Printing all employees");
			for(int i=0;i<employeeList.size();i++){
				System.out.println(employeeList.get(i));
				found = true;//becomes true if there is even one object stored

			}
		}
		else{
			System.out.print ("Enter threshold: ");
			double threshold = scanner.nextDouble();
			System.out.println("Printing all employees that earn more than " + threshold);
			for(int i=0;i<employeeList.size();i++){
				if(employeeList.get(i).getSalary()>=threshold ){//why???
					System.out.println(employeeList.get(i));
					found = true;//becomes true if there is even one object stored
				}
			}
		}
		if (!found){
			System.out.println("Employees not found");
		}
	}



	private static void createNewEmployee() {
		System.out.println("Create new Employee");
		System.out.print("Employee's name: ");
		scanner.nextLine();// !don't pay attention to this line!
		String name = scanner.nextLine();
		System.out.print("Employee's salary: ");
		double salary = scanner.nextDouble();
		employeeList.add(new Employee(name,salary));

	}
	private static void giveRaise() {
		System.out.println("Give raise, insert id");
		int id = scanner.nextInt();
		boolean found = false;
		for(int i=0; i<employeeList.size(); i++){
			if(employeeList.get(i).getEmployee_id()==id){
				System.out.print("Raise:");
				double raise = scanner.nextDouble();
				double current = employeeList.get(i).getSalary();
				employeeList.get(i).setSalary(raise+current);
				found = true;
				break;
			}

		}
		if(!found){
			System.out.println("Id not found");
		}
	}

	private static void removeEmployee() {
		System.out.print("Choose employee to remove: ");
		int id = scanner.nextInt();
		boolean found = false;
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getEmployee_id() == id) {
				employeeList.remove(i);
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("Id not found");
	}
}

