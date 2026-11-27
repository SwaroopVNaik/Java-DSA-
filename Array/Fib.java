public class Fib{

    void fibonicaaSeries(int first, int second)
    {
        System.out.print(first + " " + second + " ");

        for(int index = 2; index < 10; index = index + 1)
        {
            int next = first + second;

            System.out.print(next + " ");

            first = second;

            second = next;
        }
    }
    public static void main(String[] args)
    {
        int first = 0;
        int second = 1;

        Fib obj = new Fib();
        obj.fibonicaaSeries(first, second);
    }

}