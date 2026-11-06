class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {          //No-argument constructor
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name) {  //Constructor with product name only
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price) {   //Constructor with product name and price
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {    //Constructor with all three fields
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotalCost() {
        return price * quantity;
    }
    public void displayDetails() {
        System.out.println("Product Name : " + name);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : " + calculateTotalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\n    Using no-argument constructor    ");
        Product p1 = new Product();
        p1.displayDetails();
        System.out.println("\n    Using name-only constructor    ");
        Product p2 = new Product("Laptop");
        p2.displayDetails();
        System.out.println("\n    Using name + price constructor    ");
        Product p3 = new Product("Mouse", 25.50);
        p3.displayDetails();
        System.out.println("\n    Using all-three-fields constructor    ");
        Product p4 = new Product("Keyboard", 45.99, 3);
        p4.displayDetails();
    }
}
