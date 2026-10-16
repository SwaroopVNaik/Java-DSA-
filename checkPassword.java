public class checkPassword 
{

    static void isPasswordValid(char [] password)
    {

        if(password == null || password.length == 0)
        {
            System.out.println("No Characters");
        }

        if(password.length < 8)
        {
            System.out.println("Please Enter Minimium 8 and above Charcters");
        }

        char Special [] = {'*', '$', '@'};

        Boolean isDigit = false;
        Boolean isUppercase = false;
        Boolean isLowerCase = false;
        Boolean MinimumDigit = false;
        Boolean specialsCharacter = false;

        int index = 0;
        while(index < password.length)
        {
            char ch = password[index];

            // int j = 0;
            // while(j < Special.length) 
            // {
            //     if(password[index] != Special[j])
            //     {
            //         System.out.println("Not allowed character" + password[index]);
            //     }
            // }
            

            if(ch >= 'A' && ch <= 'Z')
            {
                isUppercase = true;
                
            }
            
            if(ch >= 'a' && ch <= 'z')
            {
                isLowerCase = true;
                
            }

            if(ch >= '0' && ch <= '9')
            {
                isDigit = true;
                
            }

            if(ch == '*' || ch == '$' || ch == '@' )
            {
                specialsCharacter = true;
            }

            if(password.length >= 8)
            {
                MinimumDigit = true;
                
            }

            index = index + 1;
        }

        if(isUppercase == false)
        {
            System.out.println("password must contain atleast one capital letter : A - Z");
        }

        if(isLowerCase == false)
        {
            System.out.println("password must contain altleast one lowercase charecter : a - z");
        }

        if(isDigit == false)
        {
            System.out.println("password must contain atleast one digit : 0 - 9");
        }

        if(specialsCharacter == false)
        {
            System.out.println("password must contain alteast one special character : * | $ | @");
        }

        if(isUppercase == true && 
            isLowerCase == true && 
            isDigit == true  && 
            specialsCharacter == true &&
            MinimumDigit == true
        )
        {
            System.out.println("Congratulations ! valid password");
        }
        else
        {
            System.out.println("Password is invalid");
        }
    }


    public static void main(String[] args) 
    {
        // char password [] = {'a', 'B', '*', '4', '@', 's', 's', '8', ','};
       char password [] = {'a','a','a', 'a', 'a', 'a', 'a'};
       
        // char password [] = {'A','a','@', 'a', 'h', 'a'};
       
       
        isPasswordValid(password);
    }
}
