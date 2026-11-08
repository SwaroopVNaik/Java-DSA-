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

    // Problem 3
    boolean isExpressionBalanced(String equation)
    {
        if(equation == null)
        {
            return false;
        }

        StackcreationCharacter mystackV1 = new StackcreationCharacter(equation.length());
        boolean isBalanced = true;

        for(int index = 0; index < equation.length(); index = index + 1)
        {
            char ch = equation.charAt(index);
            if(ch == '(')
            {
                mystackV1.push(ch);
                // continue;
            }
            else if(ch == ')')
            {
                if(mystackV1.peek() == '*')
                {
                    isBalanced = false;
                    break;
                }
                mystackV1.pop();
            }
        }

        if(mystackV1.peek() != '*')
        {
            isBalanced = false;
        }

        return isBalanced;
    }

    // Problem 4
    boolean isExpressionBalancedV2(String equation)
    {
        if(equation == null)
        {
            // ask the Interviewer
            return false;
        }

        StackcreationCharacter mystack = new StackcreationCharacter(equation.length());
        boolean isBalanced = true;

        for(int index = 0; index < equation.length(); index = index + 1)
        {
            char ch = equation.charAt(index);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                mystack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if
                (
                    (ch == ')' && mystack.peek() != '(') ||
                    (ch == '}' && mystack.peek() != '{') ||
                    (ch == ']' && mystack.peek() != '[')
                )
                {
                    isBalanced = false;
                    break;
                }

                if(mystack.peek() == '*')
                {
                    isBalanced = false;
                    break;
                }

                mystack.pop();

            }
        }

        if(mystack.peek() != '*')
        {
            isBalanced = false;
        }

        return isBalanced;

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


        // problem 3
        String expression = "((a + 1) * (b - 2))";

        Problems obj = new Problems();
        boolean resultv2 = obj.isExpressionBalanced(expression);
        System.out.println("\nThe Expression is : " + resultv2);

        // Problem 4
        String expressionv1 = "({[]})";
        boolean resultv3 = obj.isExpressionBalancedV2(expressionv1);
        System.out.println("\nThe Expression is : " + resultv3);
    }

}
