package Two_Arrays;

class TwoD {

    public static void main(String[] args)
    {

        // Printing the Elements from 2D Arrays
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int index = 0;
        while(index < A.length)
        {
            int jndex = 0;
            while(jndex < A[0].length)
            {
                System.out.print(A[index][jndex] + " ");

                jndex = jndex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        
    }
    
}