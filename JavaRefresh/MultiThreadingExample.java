class Mythread extends Thread {
    private String threadName;
    Mythread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int ind = 1; ind <= 5; ind++) {
            System.out.println(threadName + " -> " + ind);
            try {
                Thread.sleep(1000);
            } catch(Exception exp) {
                System.out.println(threadName + exp.getMessage());
            }
        }

        System.out.println(threadName + " Finished");
    }
}
public class MultiThreadingExample {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread("thread1");
        Mythread thread2 = new Mythread("thread2");
        Mythread thread3 = new Mythread("thread3");
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("All threads are finished");
    }
}