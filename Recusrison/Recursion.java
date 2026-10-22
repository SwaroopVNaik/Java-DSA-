package Recusrison;

public class Recursion {

    static void fun(int n)
    {
        // 1) work before call
        // if(n >= 0)
        // {

        //     // before
        //     System.out.println(n);

        //     // call
        //     fun(n - 1);
        // }

        // 2) work after call 
        // if(n > 0)
        // {
        //     // call
        //     fun(n - 1);

        //     // after
        //     System.out.println(n);
        // }

        // // 3) before call and after call 
        // if(n > 0)
        // {
        //     // before
        //     System.out.println(n);

        //     // call
        //     fun(n - 1);

        //     // after
        //     System.out.println(n);
        // }
    }

    public static void main(String[] args)
    {
        fun(3);
    }

}
