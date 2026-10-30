package Two_Arrays;

public class TwoD 
{
    public static void main(String[] args) 
    {
        int A [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
        
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int s[] : A)
        {
            for(int F : s)
            {
                System.out.print(F + " ");
            }
            System.out.println();
        }

        System.out.println();

        int B[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int C[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int D[][] = new int[B.length][B[0].length];

        for(int i = 0; i < B.length; i ++)
        {
            for(int j = 0; j < C[0].length; j ++)
            {
                D[i][j] =  B[i][j] + C[i][j];
                // System.out.print(D[i][j] + " ");
            }
            // System.out.println();
        }

        System.out.println();

        for(int x [] : D)
        {
            for(int j : x)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
