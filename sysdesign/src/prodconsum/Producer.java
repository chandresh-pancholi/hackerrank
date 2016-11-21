package prodconsum;

import java.util.Vector;

/**
 * Created by user on 09/04/16.
 */
public class Producer implements Runnable{

    private final Vector sharedQueue;
    private final int SIZE;

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(" Produced: " + i);
            try{
                produced(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    private void produced(int i) throws InterruptedException {
        //wait if queue is full
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println(" Queue is Full ");
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notify();
        }
    }
}
