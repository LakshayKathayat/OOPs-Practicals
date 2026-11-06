interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();
    }
}
