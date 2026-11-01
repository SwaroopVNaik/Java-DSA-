package Two_Arrays;

class JackedArray {

    public static void main(String[] args) 
    {
        // 2D Array Declaration
        int  A[][];

        // Jacked Array !
        A = new int[3][];

        A[0] = new int [5];
        A[1] = new int [3];
        A[2] = new int [8];

        int x  = 1;

        for(int i = 0 ; i < A.length; i ++)
        {
            for(int j = 0; j < A[i].length; j ++)
            {
                A[i][j] = x;
                System.out.print(A[i][j] + " ");
                x++;
            }
            System.out.println();
        }
    }
    
}