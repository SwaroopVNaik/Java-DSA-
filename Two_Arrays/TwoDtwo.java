package Two_Arrays;

import java.util.Scanner;

public class TwoDtwo 
{
    static void printingTwoDimensionalArray(int A[][])
    {
        for(int row = 0; row < A.length; row = row + 1)
        {
            for(int col = 0; col < A[row].length; col = col + 1)
            { 
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void printingRow(int data[][], int rowInput)
    {
        // if data is empty
        if(data == null)
        {
            return;
        }

        // checking row input range
        if(rowInput <= 0 || rowInput > data.length)
        {
            System.out.println("Invalid Input");
            return;
        }

            for(int col = 0; col < data[rowInput - 1].length; col = col + 1)
            {
                System.out.print(data[rowInput - 1][col] + " ");
            }
    }

    static void printingCol(int data[][], int colInput)
    {
        if(data == null)
        {
            return;
        }

        if(colInput <= 0 || colInput > data.length)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(int row = 0; row <= colInput - 1; row = row + 1)
        {
            if(colInput > data[row].length)
            {
                continue;
            }
            System.out.println(data[row][colInput - 1] + " ");
        }

    }

    static void printingleftTorRight(int [][] data)
    {
        System.out.println("Printing left to right : ");
        System.out.println();
        for(int row = 0; row < data.length; row = row + 1)
        {
            for(int col = 0; col < data[row].length; col = col + 1)
            {
                if(row == col)
                {
                    System.out.print(data[row][col]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printingRightToleft(int [][] data)
    {
        int collength = data.length - 1;
        System.out.println("\nPrinting right to left ");
        System.out.println();
        for(int row = 0; row <= collength; row = row + 1)
        {
            for(int space = 0; space < collength - row; space = space + 1)
            {
                System.out.print(" ");
            }

            System.out.println(data[row][collength - row]);
        }
    }

    static void printingLefttoRightAndRightToLeft(int [][] data)
    {
        System.out.println("\nPrinting left to right and right to left : ");
        int collength = data.length;
        for(int row = 0; row < data.length; row = row + 1)
        {
            for(int col = 0; col < data[row].length; col = col + 1)
            {
                if(row == col)
                {
                    System.out.print(data[row][col]);
                }
                else if(row + col == collength - 1)
                {
                    System.out.print(data[row][col]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        // int [][] A = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};

        // printingTwoDimensionalArray(A);

        // int data[][] = {

        //     {11, 12, 13, 14, 15},
        //     {21, 22, 23, 24, 25},
        //     {31, 32},
        //     {41, 42, 43, 44, 45},
        //     {51, 52}

        // };

        int dataV2[][] = {

            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25},
            {31, 32, 33, 34, 35},
            {41, 42, 43, 44, 45},
            {51, 52, 53, 54, 55}

        };



        // System.out.println("\nJacked Array");
        // printingTwoDimensionalArray(data);

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the Row : ");
        // int row = scanner.nextInt();

        // System.out.println("Enter the Col : ");
        // int col = scanner.nextInt();

        // printingRow(data, row);

        // printingCol(data, col);

        printingleftTorRight(dataV2);

        printingRightToleft(dataV2);

        printingLefttoRightAndRightToLeft(dataV2);

    scanner.close();
    }

}
