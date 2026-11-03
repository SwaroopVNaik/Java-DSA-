package Two_Arrays;

public class Problems 
{

    // Problem 1
    static void printSumOfElements(int [][] A)
    {
        int sum = 0;
        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                sum = sum + A[row][col];
            }
        }

        System.out.println("The Total Sum Of elements is : "  + sum);
    }

    // Problem 2 
    static int getMaxNumber(int [][] A)
    {
        int Max = A[0][0];

        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] > Max)
                {
                    Max = A[row][col];
                }
            }
        }

        return Max;
    }

    // Problem 3
    static int getMinNumber(int [][] A)
    {
        int min = A[0][0];

        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] < min)
                {
                    min = A[row][col];
                }
            }
        }

        return min;
    }

    // Problem 4
    static int [] getEvenCountAndOddCount(int [][] A)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] % 2 == 0)
                {
                    evenCount = evenCount + 1;
                }

                if(A[row][col] % 2 != 0)
                {
                    oddCount = oddCount + 1;
                }
            }
        }

        return new int[]{evenCount, oddCount};    
    }

    // Problem 5
    static boolean searchElementInMatrix(int [][] A, int key)
    {
        Boolean found = true;

        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] == key)
                {
                    found = true;
                    break;
                }
                else
                {
                    found = false;
                }
            }
        }

        return found;
    }

    // ---------------------------- Level 2 -------------------------------

    // problem 1
    static int [][] ScalarMultiplication(int [][] A, int scalar)
    {
        int[][] B = new int[A.length][A[0].length];
        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                B[row][col] = scalar * A[row][col];
            }
            
        }

        return B;
    }

    // Problem 2
    static int [] getMaxOfEveryRow(int [][] A)
    {
        int max = 0;
        int newArray[] = new int[A[0].length];
        int newIndex = 0;


        for(int row = 0; row < A.length; row = row + 1)
        {
            max = A[row][0];
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] > max)
                {
                    max = A[row][col];
                }
            }

            newArray[newIndex ++] = max;
        }

        return newArray;
    }

    // Problem 3
    static int getMinEvenValue(int [][] A)
    {
        int minEvenValue = 0;
        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(A[row][col] % 2 == 0)
                {
                    minEvenValue = A[row][col];
                    break;
                }

            }
        }

        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {

                int number = A[row][col];
                
                if(number % 2 == 0)
                {
                    if(number < minEvenValue)
                    {
                        minEvenValue = A[row][col];
                    }
                }
            }
        }

        return minEvenValue;
    }

    // Problem 4
    static int [][] getTheMainDiagnolMultiBy10(int [][] A, int scalar)
    {
        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            {
                if(row == col)
                {
                    A[row][col] = A[row][col] * scalar;
                }
            }
        }

        return A;
    }

    public static void main(String[] args) 
    {

        int MatrixOne[][] = {{3, 5, 9}, {7, 6, 2}, {4, 8, 1}};

        printSumOfElements(MatrixOne); // o/p : 45

        int max = getMaxNumber(MatrixOne);
        System.out.println("The Max Number is : " + max); // o/p : 9

        int min = getMinNumber(MatrixOne);
        System.out.println("The Min Number is : " + min); // o/p : 1

        int [] result = getEvenCountAndOddCount(MatrixOne); // o/p : 4, 5
        System.out.print("The EvenCount and OddCount is : ");
        System.out.print("[");
        for(int r : result)
        {
            System.out.print(r + " ");
        }
        System.out.print("]");

        Boolean found = searchElementInMatrix(MatrixOne, 8);
        if(found == true)
        {
            System.out.println("\nKey is Found");
        }
        else
        {
            System.out.println("\nKey is not found");
        }

        System.out.println("\nScaler Multiplication : ");

        for(int x [] : MatrixOne)
        {
            for(int val :  x)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int MultiResult [][] = ScalarMultiplication(MatrixOne, 2);

        System.out.println("\nAfter Multipication : ");
        for(int x [] : MultiResult)
        {
            for(int val : x)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int maxResult [] = getMaxOfEveryRow(MatrixOne);
        System.out.println("\nMaximum Values in each Row : ");
        System.out.print("[");
        for(int val : maxResult)
        {
            System.out.print(val + " ");
        }
        System.out.print("]");

        int minEvenValue = getMinEvenValue(MatrixOne);
        System.out.println("\nThe Minimum Even Value is : " + minEvenValue);

        int [][] mainDiagnolResult = getTheMainDiagnolMultiBy10(MatrixOne, 10);
        System.out.println("\nMultiplying Diagnol By 10");
        System.out.println("[");
        for(int [] x : mainDiagnolResult)
        {
            for(int val : x)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.print("]");



    }

}
