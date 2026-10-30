package Two_Arrays;

class JackedArray {

    public static void main(String[] args) 
    {
        char A[][];

        A = new char[3][];

        A[0] = new char[5];
        A[1] = new char[3];
        A[2] = new char[8];

        char x  = 'S';

        for(int i = 0 ; i < A.length; i ++)
        {
            for(int j = 0; j < A[i].length; j ++)
            {
                A[i][j] = x;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}