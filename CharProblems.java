public class CharProblems
{
    static int [] NoOfVowelsAndConsonants(char [] characters)
    {

        if(characters == null || characters.length == 0)
        {
            return new int[]{-1};
        }

        char alpha = 'a';
        char alphz = 'z';

        char alphA = 'A';
        char alphZ = 'Z';
        
        int vowelsCount = 0;
        int constantCount = 0;
        int index = 0;

        while(index < characters.length)
        {
            if((characters[index] >= alphA && characters[index] <= alphZ) ||
                (characters[index] >= alpha && characters[index] <= alphz)
            )
            {
                if((characters[index] == 'a' || characters[index] == 'A') ||
                   (characters[index] == 'e' || characters[index] == 'E') ||
                    (characters[index] == 'i' || characters[index] == 'I') ||
                    (characters[index] == 'u' || characters[index] == 'U') ||
                    (characters[index] == 'o' || characters[index] == 'O')
                )
                {
                    vowelsCount = vowelsCount + 1;
                }
                else
                {
                    constantCount = constantCount + 1;
                }
            }

            index = index + 1;

        }
        return new int[]{vowelsCount , constantCount};
    }

    public static void main(String[] args) 
    {
        char array [] = {'a', 'p', 'p', 'l', 'e'};

        int result [] = NoOfVowelsAndConsonants(array);

        for(int index = 0; index < result.length; index = index + 1)
        {
            System.out.println(result[index]);
        }
    }
}
