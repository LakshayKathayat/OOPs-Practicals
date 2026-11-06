class Student{          //class
    int rollNumber;
    String name;
    int pmark;          //instance variables
    int cmark;
    int mmark;

    public Student(int rollNumber, String name, int pmark, int cmark, int mmark) {      //constructors
        this.rollNumber = rollNumber;
        this.name = name;
        this.pmark = pmark;
        this.cmark = cmark;
        this.mmark = mmark;
    }

    public double calculateTotal() {        //methods
        return pmark + cmark + mmark;
    }

    public double calculatePercentage() {   //methods
        return (calculateTotal() / 300.0) * 100.0;
    }

    public void displayDetails() {
        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + pmark + ", " + cmark + ", " + mmark);
        System.out.println("Total Marks : " + calculateTotal() + " / 300");
        System.out.printf("Percentage  : %.2f%%\n", calculatePercentage());
    }
}
public class Practical1{
    public static void main(String[] args) {
        //objects
        Student s1 = new Student(101, "Lokesh",56 , 56, 25);
        Student s2 = new Student(102, "Onkar", 49, 27, 38);
        Student s3 = new Student(103, "Naveen", 59, 69, 69);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
