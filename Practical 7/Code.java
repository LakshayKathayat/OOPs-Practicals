class MyObject{
    MyObject(){
        System.out.println("Object is created.");
    }
    void display(){
        System.out.println("Object is being used.");
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector is reclaiming an object.");
    }
}

public class Main{
 public static void main(String[] args){
        System.out.println(" Object Creation ");
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        obj1.display();
        obj2.display();

        System.out.println("\n Removing Refrence ");
        obj1 = null;
        obj2 = null;

        System.out.println("References have been removed.");
        System.out.println("Objects are now eligible for garbage collection.");

        System.out.println("\n Requesting Garbage Collection");
        System.gc();
       System.out.println("Garbage collection has been requested.");
       System.out.println("\nProgram execution completed.");
    }
}
