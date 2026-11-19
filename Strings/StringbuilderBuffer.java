public class StringbuilderBuffer 
{
    public static void main(String[] args) 
    {
        demoAppend();
        demoInsert();
        demoDelete();
        demoReplace();
        demoReverse();
        demoCapcity();
        demoEnsureCapacity();
        demosetCharAt();
        demosetLength();
    }   
    
    // 1) append()
    // Adds text at the end
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);

    }

    // 2) insert() -- > Insert text at specified Index
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Jva");

        sb.insert(1, "a");

        System.out.println(sb);
        
    }

    // 3) delete() --> deletes char begin to end - 1
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");

        sb.delete(4, 16);

        System.out.println(sb);
    }

    // 4) replace() --> replaces characters
    public static void demoReplace()
    {
        StringBuilder sb = new StringBuilder("Java Programming");

        sb.replace(0, 4, "Python");

        System.out.println(sb);
    }

    // 5) Reverse() --> 
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java Programming");

        sb.reverse();

        System.out.println(sb);
    }
    
    // 6) capacity() 
    public static void demoCapcity()
    {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Capacity : " + sb.capacity());
    }

    // 7) EnsureCapacity()
    public static void demoEnsureCapacity()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.ensureCapacity(50);

        System.out.println("EnsureCapacity : " + sb);
    }

    // 8) setCharAt
    public static void demosetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java");

        sb.setCharAt(0, 'K');

        System.out.println("Capacity : " + sb);
    }

    // 9) setLength
    public static void demosetLength()
    {
        StringBuilder sb = new StringBuilder("Programming");

        sb.setLength(7);

        System.out.println("Capacity : " + sb);
    }

    // 10) substring.
    // 11) toString.
    

    // ---> Methods for String buffer
    // append();
    // Reverse();


}
