import java.util.*;

public class ProblemOne 
{

    static void getComparisonOfNumber(int [] array, int key)
    {
        

        // testCase 1 -> array is empty
        if(array.length == 0)
        {
            System.out.println("The Array is Empty");
            return; 
        }
        else
        {
            for(int index = 0; index < array.length; index = index + 1)
            {
                if(key > array[index])
                {
                    System.out.println(key + " > " + array[index]);
                }
                else if(key == array[index])
                {
                    System.out.println(key + " == " + array[index]);
                }
                else if(key < array[index])
                {
                    System.out.println(key + " < " + array[index]);
                }

            }
        }


    }


    public static void main(String[] args) 
    {

        int array [] = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key : ");
        int key = scanner.nextInt();

        getComparisonOfNumber(array, key);

    
    scanner.close();
    }


}
