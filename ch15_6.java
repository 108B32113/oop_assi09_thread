class Sub  implements Runnable 
{
    private int n;
    private int sum = 1;
    public Sub(int a)
    {
        n = a;
    }

    public void cal() {
        for (int i = 1; i <= n; i++) {
            sum *= n;
        }
        System.out.println("答案等於: " + sum);
    }

    public void run() { //用run來發動剛剛寫的計算方法
        cal();
    }
}

public class ch15_6 {
    public static void main(String args[])
    {
        Sub num1 = new Sub(5);
        Sub num2 = new Sub(10);

        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);

        thread1.start();
        thread2.start();
    }
}
