public class Array{

    public static void main(String[] args)
    {
        int[] marks = new int[5];

        // System.out.print(marks[0] + " ");
        // System.out.print(marks[1] + " ");
        // System.out.print(marks[2] + " ");
        // System.out.print(marks[3]);
        
        for(int index = 0; index < marks.length; index = index + 1)
        {
            // marks[2] = 100;
            System.out.print(marks[index] + " ");
        }

        for(int number : marks)
        {
            System.out.println();
            System.out.print(marks[number] +  " ");
        }

    }

}