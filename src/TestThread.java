public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread threadOdd = new Thread(oddThread);
        Thread threadEven = new Thread(evenThread);
        threadOdd.start();
        try {
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadEven.start();
    }
}
