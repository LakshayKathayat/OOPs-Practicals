class Device {
    void powerOn() {
        System.out.println("Device is switched ON.");
    }
}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter extends Device implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Practical3b {
    public static void main(String[] args) {
        AllInOnePrinter p = new AllInOnePrinter();

        p.powerOn();  // Inherited from Device
        p.print();    // From Printable
        p.scan();     // From Scannable
    }
}
