package producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created by user on 15/03/16.
 */
public class Producer2 implements Runnable {
    private final BlockingQueue sharedQueue;

    public Producer2(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i = 10; i < 20; i++) {
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }

        }
    }
}
