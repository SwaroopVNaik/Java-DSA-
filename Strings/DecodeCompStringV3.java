public class DecodeCompStringV3 
{
    public static char [] decodeString(String val)
    {
        int totalArrayLength = countStringLength(val);
        int writeIndex = 0;
        char aplha = ' ';

        char [] newArray = new char[totalArrayLength];

        for(int readIndex = 0; readIndex < val.length(); readIndex ++)
        {
            if(val.charAt(readIndex) >= 'a' && val.charAt(readIndex) <= 'z')
            {
                newArray[writeIndex++] = val.charAt(readIndex);
                aplha = val.charAt(readIndex);

            }

            if(val.charAt(readIndex) >= '0' && val.charAt(readIndex) <= '9')
            {
                int number = val.charAt(readIndex) - '0';

                for(int index = 0; index < number - 1; index = index + 1)
                {
                    newArray[writeIndex++] = aplha;
                }
            }
        }

        return newArray;
    }

    public static int countStringLength(String val)
    {
        int countArrLen = 0;
        int countAlpha = 0;

        for(int index = 0; index < val.length(); index = index + 1)
        {
            if(val.charAt(index) >= '0' && val.charAt(index) <= '9')
            {
                int num = val.charAt(index) - '0' - 1;

                countArrLen = countArrLen + num;
            }

            if(val.charAt(index) >= 'a' && val.charAt(index) <= 'z')
            {
                countAlpha++;
            }
        }

        return countArrLen + countAlpha;
    }

    public static void main(String[] args) 
    {
        String val = "a3b2c1";
        char [] array = decodeString(val);

        for(char x : array)
        {
            System.out.print(x);
        }
    }    
}
