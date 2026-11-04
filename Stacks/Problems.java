package Stacks;

public class Problems {

    // Problem 1
    static boolean checkPalindrome(int number)
    {
        int count = 0;
        int value = number;
        int finalvalue = number;
        int LastDigit = 0;

        while(number > 0)
        {
            LastDigit = number % 10;

            count = count + 1;

            number = number / 10;

            LastDigit = 0;
        }
        
        Stackcreation mystack = new Stackcreation(count);

        while (value > 0) 
        {
            int last = value % 10;

            mystack.push(last);

            value = value / 10;
            
        }

        boolean result = true;
        while (mystack.top != -1 && finalvalue > 0) 
        {
            LastDigit = mystack.pop();

            int last = finalvalue % 10;

            if(LastDigit == last)
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }

            finalvalue = finalvalue / 10;
        }

        return result;

    }

    // Problem 2
    static int [] reverseNumber(int [] number)
    {
        Stackcreation mystack = new Stackcreation(number.length);

        int [] newArray = new int[number.length];
        int newIndex = 0;

        int index = 0;
        while(index < number.length)
        {
            mystack.push(number[index]);

            index = index + 1;
        }

        while(mystack.top != -1)
        {
            newArray[newIndex ++] = mystack.pop();
        }

        return newArray;
    }

    public static void main(String[] args) 
    {
        // Problem 1
        int number = 121;
        boolean result = checkPalindrome(number);
        System.out.println("The number is palindrome : " + result);

        // Problem 2
        int [] num = {1, 2, 3, 4, 5};

        int [] reverseResult = reverseNumber(num);
        System.out.print("[");
        for(int values : reverseResult)
        {
            System.out.print(values + " ");
        }
        System.out.print("]");
    }

}
