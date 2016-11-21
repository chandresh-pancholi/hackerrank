package producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by user on 15/03/16.
 */
public class ProducerConsumerPattern {
   public static void main(String args[]) {

       BlockingQueue blockingQueue = new LinkedBlockingDeque<>();

       Thread producerThread = new Thread(new Producer(blockingQueue));
       Thread producerThread2 = new Thread(new Producer2(blockingQueue));
       Thread consumerThread = new Thread(new Consumer(blockingQueue));


       producerThread.start();
       producerThread2.start();
       consumerThread.start();
   }
}
