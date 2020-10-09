public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 10 ;i+= 2) {
            System.out.println(this + "---" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
