// 實作Runnable介面的類別
class MyRunnable implements Runnable {
    private String message;
    private long sleepInterval;
    private int runCount;

    public MyRunnable(String message, long sleepInterval) {
        this.message = message;
        this.sleepInterval = sleepInterval;
        this.runCount = 0;
    }

    @Override
    public void run() {
        while (runCount < 10) {
            System.out.println(message);
            runCount++;
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ch15_7 {
    public static void main(String[] args) {
        // 建立Runnable物件
        Runnable runnable1 = new MyRunnable("Thread 1 is running...", 1000);
        Runnable runnable2 = new MyRunnable("Thread 2 is running...", 2500);

        // 使用Runnable物件建立兩個執行緒
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        // 啟動執行緒
        t1.start();
        t2.start();
    }
}