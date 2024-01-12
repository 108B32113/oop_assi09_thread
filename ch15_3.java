class Test extends Thread
{   
    private String id;
    Test(String str)
    {
        id = str; //有先給定型態後就不用家型態在變數前面了
    }

    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<100000000; j++);
            System.out.println(id + " " + i);
        }
    }

    
}

public class ch15_3
{
    public static void main(String args[])
    {
        Test hi = new Test("Hello");
        Test bye = new Test("Goodbye");

        //(b)
        Test morning = new Test("Good morning");
        morning.start();

        //(c)
        Test night = new Test("good night");
        night.start();

        //(a)
        hi.start();
        bye.start();
        /*當你使用多執行緒時，執行緒的執行順序不受控制，它們可能會交替執行或並行執行，
        具體取決於操作系統的調度和執行緒之間的競爭。這就是為什麼你看到的輸出順序不同於
        run()方法的呼叫順序*/

        /*(a)output:
            Goodbye 1
            Hello 1
            Goodbye 2
            Goodbye 3
            Hello 2
            Goodbye 4
            Goodbye 5
            Hello 3
            Hello 4
            Hello 5
        */
    }
}