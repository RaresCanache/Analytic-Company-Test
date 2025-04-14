package Threads;

public class Robot extends Thread {
    public static void main(String[] args) {
        Object lock = new Object();

        HorizontalThread t1 = new HorizontalThread(lock);
        t1.start();

        VerticalThread t2 = new VerticalThread(lock);
        t2.start();

    }
}
