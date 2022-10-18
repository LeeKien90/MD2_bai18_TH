public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running.........");
        MyThread myThread1 = new MyThread("Thread mail 2");
        myThread1.start();
        MyThread myThread2 = new MyThread("Thread mail 3");
        myThread2.start();

        System.out.println("Main thread Stop...........");
    }
}