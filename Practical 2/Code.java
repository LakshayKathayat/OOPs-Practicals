//Single Inheritance
class Vehicle {
    String brand = "Toyota";
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    int speed = 120;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

//Multi-level inheritance
class Person {
    String name = "Rahul";
    void displayName() {
        System.out.println("\nName: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";
    void displayManager() {
        System.out.println("Department: " + department);
    }
}

//Hierarchial Inheritance
class Shape {
    void display() {
        System.out.println("\nThis is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;
    void area() {
        System.out.println("Circle area: "+ (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 4, breadth = 6;
    void area() {
        System.out.println("Rectangle area: "+ (length * breadth));
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();       // Single Inheritance
        c.display();

        Manager m = new Manager();
        m.displayName();            // Multilevel inheritance
        m.displayEmployee();   
        m.displayManager(); 

        Circle ci = new Circle();
        ci.display();  // Inherited from Shape
        ci.area();
                                                //Hierrarchial Inheritance
        Rectangle r = new Rectangle();
        r.display();  // Inherited from Shape
        r.area();
    }
}
