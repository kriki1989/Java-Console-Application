public class Employee {
    private static int countEmployeeObjects;//counts Employee objects

    // fields
    private int employee_id;
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        employee_id = ++countEmployeeObjects;// id has auto increment value
        this.name = name;
        this.salary = salary;
    }

    //countEmployeeObjects is private so we need a getter
    public static int getCountEmployeeObjects() {
        return countEmployeeObjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    //object representation
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", name=" + name + ", salary=" + salary + "]";
    }

}
