class Employee {
    String empName;
    double salary;
    static int empCount = 0;

    Employee() {    //No-argument constructor
        this("Unknown", 0.0);          // MUST be the first statement
        System.out.println("No-arg constructor called (delegated via this())");
    }

    Employee(String empName, double salary) {   //Parameterized constructor
        this.empName = empName;         // this.empName -> field, empName -> parameter
        this.salary  = salary;
        empCount++;                     // increment shared counter on every creation
        System.out.println("Employee created: " + this.empName + "    Salary: " + this.salary);
    }
    static void displayCount() {
        System.out.println("Total employees created: " + empCount);
    }
    void displayDetails() {
        System.out.println("Name: " + empName + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aarav", 55000);    //Parameterized object
        Employee e2 = new Employee("Diya", 68000);

        Employee e3 = new Employee();    //No-arg object

        System.out.println("\n    Individual details    ");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        System.out.println("\n    Static count    ");
        Employee.displayCount();   // called with class name
        e1.displayCount();         // also legal, but class-name style preferred
    }
}
