class ComplexNumber {
    private final double real;
    private final double imag;
    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + Math.abs(imag) + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, -2);
        ComplexNumber sum = c1.add(c2);
        System.out.print("First number : ");  c1.display();
        System.out.print("Second number: ");  c2.display();
        System.out.print("Sum          : ");  sum.display();
    }
}
