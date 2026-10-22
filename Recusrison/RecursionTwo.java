package Recusrison;

public class RecursionTwo 
{
    static void fun(int n)
    {
        if(n > 0)
        {
            System.out.println("Enter : " + n);

            fun(n - 1);

            System.out.println("Exit : " + n);
        }
    }

    public static void main(String[] args) 
    {
        fun(3);
    }
}
