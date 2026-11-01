package Two_Arrays;

class TwoD {

    public static void main(String[] args)
    {

        // Printing the Elements from 2D Arrays
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}};

        System.out.println("\nPrinting the address and length of the 2D Array : ");
        System.out.println(A);
        System.out.println("2D array rows length : " + A.length);
        System.out.println("2D arrays coloumns length : " + A[0].length);
        System.out.println("2D arrays coloumns length : " + A[1].length);
        System.out.println("2D arrays coloumns length : " + A[2].length);

        System.out.println("\nPrinting Using while Loop : ");

        int index = 0;
        while(index < A.length)
        {
            int jndex = 0;
            while(jndex < A[index].length)
            {
                System.out.print(A[index][jndex] + " ");

                jndex = jndex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        // Printing using for each loop

        System.out.println("\nPrinting Using Enhanced for Loop : ");

        for(int [] x : A)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // 2D array Addition 

        int B[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int C[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println("\nAddtion of 2D Array : ");

        index = 0;
        while(index < B.length)
        {
            int jindex = 0;
            while (jindex < B[index].length) 
            {
                System.out.print(B[index][jindex] + " ");

                jindex = jindex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        System.out.println("+++++");

        index = 0;
        while(index < C.length)
        {
            int jindex = 0;
            while (jindex < C[index].length) 
            {
                System.out.print(C[index][jindex] + " ");

                jindex = jindex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        // Addition Of 2d Arrays Logic 
        // B[index , jindex] + C[index, jindex]

        System.out.println("=======");

        index = 0;
        while(index < B.length || index < C.length)
        {
            int jndex = 0;
            while (jndex < B[index].length || jndex < C[index].length) 
            {
                System.out.print(B[index][jndex] + C[index][jndex] + "  ");

                jndex = jndex + 1;
            }
            System.out.println();

            index = index + 1;

        }

        // Matrix Multiplication

        System.out.println("\nMultipliction of 2D Array : ");

        index = 0;
        while(index < B.length)
        {
            int jindex = 0;
            while (jindex < B[index].length) 
            {
                System.out.print(B[index][jindex] + " ");

                jindex = jindex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        System.out.println("*****");

        int [][] D = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        index = 0;
        while(index < D.length)
        {
            int jindex = 0;
            while (jindex < D[index].length) 
            {
                System.out.print(D[index][jindex] + " ");

                jindex = jindex + 1;
            }
            System.out.println();

            index = index + 1;
        }

        System.out.println("======");

        // pending

    }
    
}