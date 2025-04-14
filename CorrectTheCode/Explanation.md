`public class carThread implements Thread {
final String brand;
final String model;
final double price;

    public carThread(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void run() {
        while (true) {
            System.out.println("hello my name is this.brand");
            Thread.sleep(300);
        }
    }

    public static void main(String[] args) {
        new carThread("Audi").run();
        new carThread("BMW").run();
        System.out.println("carThreads are running...");
    }`

- Not a mistake, but the convention is to have every class start with a capital letter (carThread -> CarThread)
- It is also good practice to add the **@Override** annotation above run() method, as it is a concrete implementation
  of the method from the Runnable interface
- `System.out.println("hello my name is this.brand");` should have been  
  `System.out.println("hello my name is " + this.brand);`
- Thread should be started using the start() method, not the run() method, as the latter will only run the code once and not start the thread properly