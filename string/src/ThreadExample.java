/**
 * Created by chandresh.pancholi on 30/08/16.
 */
public class ThreadExample {
    int amount = 10000;

    synchronized void withdraw(int amount) throws Exception{
        wait();

        System.out.println("going to withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }

    public static void main(String args[]) {
        final ThreadExample c = new ThreadExample();
        new Thread() {
            public void run() {
                try {
                    c.withdraw(15000);
                }catch (Exception e) {

                }
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }
}
