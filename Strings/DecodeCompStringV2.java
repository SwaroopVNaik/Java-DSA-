public class DecodeCompStringV2 
{
    public static void main(String[] args) 
    {
        textDecode("a10b15");
    }
    
    public static void textDecode(String input)
    {

        System.out.println("Input : " + input);

        System.out.println("Output : " + decode(input));

    }

    public static String decode(String input)
    {
        StringBuilder expandedBuilder = new StringBuilder();

        int number = 0;
        int index = 0;
        while(index < input.length())
        {
            char letter = input.charAt(index);

            index = index + 1;

            number = 0;

            while(index < input.length() && Character.isDigit(input.charAt(index)))
            {
                number = number * 10 + (input.charAt(index) - '0');   
                
                index = index + 1;
            }

            int count = 1;
            while(count <= number)
            {
                expandedBuilder.append(letter);

                count = count + 1;
            }

        }

        return expandedBuilder.toString();
    }
}
