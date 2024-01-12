class Test extends Thread
{   
    private String id;
    //(a)
    Test(String str)
    {
        id = str; //有先給定型態後就不用家型態在變數前面了
    }

    //(b)
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<100000000; j++);
            System.out.println(id + " " + i);
        }
    }

    
}

public class ch15_2
{
    //(c)
    public static void main(String args[])
    {
        Test hi = new Test("Hello");
        Test bye = new Test("Goodbye");

        hi.run();
        bye.run();
    }

    //(d)
    /*
    因為hi 跟 bye只是用了run()而不是start()所以他們只會在主thread中執行 並且會按照指令的順序打印
    */
}