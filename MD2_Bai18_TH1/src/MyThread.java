public class MyThread implements Runnable{
    private Thread t;
    private final String threadName;

    MyThread(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 10; i >0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);  // Dừng vòng lặp trong 50 ms
                System.out.println("---------------------------------------");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting" +threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
