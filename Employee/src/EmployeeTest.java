import java.util.Scanner;

public class EmployeeTest {
    static Scanner scanner = new Scanner (System.in);
    static Employee[] employeeArray = new Employee[4]; //Array that stores Employees
    public static void main (String args[]){
        Employee myEmp1 = new Employee("Maria", 1000);
        Employee myEmp2 = new Employee("Ioannis", 800);
        Employee myEmp3 = new Employee("Sofia", 1200);
        employeeArray[0] = myEmp1;
        employeeArray[1] = myEmp2;
        employeeArray[2] = myEmp3;
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
        while(choice!=-1||Employee.getCountEmployeeObjects()>=employeeArray.length);
    }

    private static void printEmployees(int choice) {
        boolean found=false;
        if (choice==1){
            System.out.println("Printing all employees");
            for(Employee empl:employeeArray){
                if(empl!=null){//why???
                    System.out.println(empl);
                    found = true;//becomes true if there is even one object stored
                }
            }
        }
        else{
            System.out.print ("Enter threshold: ");
            double threshold = scanner.nextDouble();
            System.out.println("Printing all employees that earn more than " + threshold);
            for(Employee empl:employeeArray){
                if(empl!=null && empl.getSalary()>=threshold ){//why???
                    System.out.println(empl);
                    found = true;//becomes true if there is even one object stored
                }
            }
        }
        if (!found){
            System.out.println("Employees not found");
        }
    }



    private static void createNewEmployee() {
        //the new object is stored in the next position of the array
        boolean added = false;
        for (int i=0;i<employeeArray.length;i++){
            if (employeeArray[i]==null){
                System.out.println("Create new Employee");
                System.out.print("Employee's name: ");
                scanner.nextLine();// !don't pay attention to this line!
                String name = scanner.nextLine();
                System.out.print("Employee's salary: ");
                double salary = scanner.nextDouble();
                employeeArray[i] = new Employee(name,salary);
                added = true;
                break;
            }
        }
        if (added == false){
            System.out.println("Not enough space to add new employee!!! You need to delete someone first!");
        }
        // employeeArray[Employee.getCountEmployeeObjects()] = new Employee(name, salary);// What is stored in index[0]?????

    }
    private static void giveRaise() {
        System.out.println("Give raise, insert id");
        int id = scanner.nextInt();
        boolean found = false;
        for(int i=0; i<employeeArray.length; i++){
            if(employeeArray[i]!=null){//why???
                if(employeeArray[i].getEmployee_id()==id){
                    System.out.print("Raise:");
                    double raise = scanner.nextDouble();
                    employeeArray[i].setSalary(employeeArray[i].getSalary()+raise);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Id not found");
        }
    }

    private static void removeEmployee() {
        printEmployees(1);
        System.out.print("Choose employee to remove: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {//why???
                if (employeeArray[i].getEmployee_id() == id) {
                    employeeArray[i] = null;
                    found = true;
                    break;
                }
            }
        }
        if(!found)
            System.out.println("Id not found");
    }
}

