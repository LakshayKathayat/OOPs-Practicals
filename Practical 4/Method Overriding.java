class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 20000;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmployee();
        System.out.println("Full-Time Employee Pay: "+ e.calculatePay());
        e = new PartTimeEmployee();
        System.out.println("Part-Time Employee Pay: "+ e.calculatePay());
    }
}
