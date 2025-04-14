package Threads;

import java.util.Random;

public class HorizontalThread extends Thread {
    private final Random random;
    private final Object lock;

    public HorizontalThread(Object lock) {
        random = new Random();
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                int direction = random.nextInt(2);

                switch (direction) {
                    case 0 -> System.out.println("left...");
                    case 1 -> System.out.println("right...");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
        }
    }
}
