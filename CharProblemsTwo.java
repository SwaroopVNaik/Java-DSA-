public class CharProblemsTwo {

    static char [] getUpperCaseLetters(char [] getLowerCaseLetters)
    {
        if(getLowerCaseLetters == null || getLowerCaseLetters.length == 0)
        {
            return new char[]{'0'};
        }

        char [] upperCase = new char[getLowerCaseLetters.length];
        int index = 0;
        int newindex = 0;

        while(index < getLowerCaseLetters.length)
        {
            if(getLowerCaseLetters[index] >= 'a' && getLowerCaseLetters[index] <= 'z')
            {
                upperCase[newindex] = (char)(getLowerCaseLetters[index] - 32);
                newindex = newindex + 1;
            }

            index = index + 1;
            
        }

        return upperCase;
    }

    public static void main(String[] args) {

        char LowerCaseLetter [] = {'c', 'o', 'd', 'e'};

        char result [] = getUpperCaseLetters(LowerCaseLetter);

        for(int index = 0; index < result.length; index = index + 1)
        {
            System.out.println(result[index]);
        }
    }

}
