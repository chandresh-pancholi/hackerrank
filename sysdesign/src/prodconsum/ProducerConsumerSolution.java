package prodconsum;

import java.util.Vector;

/**
 * Created by user on 09/04/16.
 */
public class ProducerConsumerSolution {
    public static void main(String[] args) {

        Vector sharedQueue = new Vector();
        int size = 4;

        Thread prodThread  = new Thread( new Producer(sharedQueue, size));
        Thread consumerThread = new Thread(new Consumer(sharedQueue, size));

        prodThread.start();
        consumerThread.start();
    }
}
