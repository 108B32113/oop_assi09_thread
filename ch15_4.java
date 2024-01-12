class Add implements Runnable {
    private int n;
    private int sum = 0;

    public Add(int a) {
        n = a;
    }

    public void cal() {
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        System.out.println("答案等於: " + sum);
    }

    public void run() {
        cal();
    }
}

public class ch15_4 {
    public static void main(String args[]) {
        Add num1 = new Add(5);
        Add num2 = new Add(10);

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);

        thread1.start();
        thread2.start();
    }
}
