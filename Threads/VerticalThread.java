package Threads;

import java.util.Random;

public class VerticalThread extends Thread {
    private final Random random;
    private final Object lock;

    public VerticalThread(Object lock) {
        random = new Random();
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                int direction = random.nextInt(2);

                switch (direction) {
                    case 0 -> System.out.println("forward...");
                    case 1 -> System.out.println("backward...");
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
