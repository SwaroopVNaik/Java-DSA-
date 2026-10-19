package CharArray;
import java.util.*;

public class CharacterProblems 
{
    
    static char getCandidateWithMostVotes(char [] BoothOne, char [] BoothTwo, char [] BoothThree)
    {
        int greatestLength = 0;

        if(BoothOne.length > BoothTwo.length && BoothOne.length > BoothThree.length)
        {
            greatestLength = BoothOne.length;
        }

        if(BoothTwo.length > BoothOne.length && BoothTwo.length > BoothThree.length)
        {
            greatestLength = BoothTwo.length;
        }

        if(BoothThree.length > BoothOne.length && BoothThree.length > BoothTwo.length)
        {
            greatestLength = BoothThree.length;
        }

        int index = 0;
        int CandidateA = 0;
        int CandidateB = 0;
        while(index < greatestLength)
        {
            if(index < BoothOne.length)
            {
                if(BoothOne[index] == 'A' || BoothOne[index] == 'a')
                {
                    CandidateA++;
                }
                
                if(BoothOne[index] == 'B' || BoothOne[index] == 'b')
                {
                    CandidateB++;
                }
            }

            if(index < BoothTwo.length)
            {
                if(BoothTwo[index] == 'A' || BoothTwo[index] == 'a')
                {
                    CandidateA++;
                }
                
                if(BoothTwo[index] == 'B' || BoothTwo[index] == 'b')
                {
                    CandidateB++;
                }
            }

            if(index < BoothThree.length)
            {
                if(BoothThree[index] == 'A' || BoothThree[index] == 'a')
                {
                    CandidateA++;
                }
                
                if(BoothThree[index] == 'B' || BoothThree[index] == 'b')
                {
                    CandidateB++;
                }
            }

            index = index + 1;
        }

        char WinResult = 0;
        if(CandidateA > CandidateB)
        {
            WinResult = 'A';
        }
        else
        {
            WinResult = 'B';
        }

        return WinResult;
    }

    static boolean checkIfBothArraysAreSame(char [] letterOne, char[] letterTwo)
    {
        if(letterOne == null || letterOne.length == 0)
        {
            return false;
        }

        if(letterTwo == null || letterTwo.length == 0)
        {
            return false;
        }

        if(letterOne.length != letterTwo.length)
        {
            return false;
        }

        boolean sameletter = true;

        boolean finalArray [] = new boolean[letterOne.length];

        int index = 0;

        while(index < letterOne.length)
        {
            sameletter = false;
            int j = 0;
            while(j < letterTwo.length)
            {
                if(letterOne[index] == letterTwo[j])
                {

                    if(sameletter == true)
                    {
                        finalArray[j] = true;
                        sameletter = true;
                        break;

                    }

                }

                j = j + 1;

            }

            index = index + 1;

        }

        int finalIndex = 0;
        Boolean result = true;

        while(finalIndex < finalArray.length - 1 && finalIndex + 1 < finalArray.length)
        {
            if(finalArray[finalIndex] == true && finalArray[finalIndex + 1] == true)
            {
                result = true;
            }
            else
            {
                result = false;
            }

            finalIndex = finalIndex + 1;
        }

        return result;
    }
  
    // ------------------------------Special Problem------------------------------------
    
    static int getReadIndex(char [] letters)
    {
        int readindex = 0;

        int index = 0;
        while(index < letters.length)
        {
            if(letters[index] == '\u0000')
            {
                break;
            }
            else
            {
                readindex++;
            }

            index = index + 1;
        }

        readindex = readindex - 1;

        return readindex;
    }

    static int getWriteIndex(char [] letters, int readindex)
    {
        int count = 0;
        int index = 0;

        while(index < letters.length)
        {
            if(letters[index] == ' ')
            {
                count = count + 1;
            }

            index = index + 1;
        }

        int writeIndex = 0;
        writeIndex = readindex + (count * 2);

        return writeIndex;

    }

    static void htmlEncoding(char [] letter, int read, int write)
    {

        if(letter == null || letter.length == 0)
        {
            return;
        }

        String user_Input = "02%";
        char [] message = user_Input.toCharArray();

        while(read >= 0)
        {
            if(letter[read] == ' ')
            {
                for(int jndex = 0; jndex < message.length; jndex = jndex + 1)
                {
                    letter[write] = message[jndex];
                    write--;
                }

                read--;

            }
            else
            {

                letter[write] = letter[read];
                write--;
                read--;

            }

        }

        printArray(letter);
    }



    static void printArray(char [] letter)
    {
        int index = 0;
        while(index < letter.length)
        {
            System.out.print(letter[index] + " ");
            index = index + 1;
        }
    }

    public static void main(String[] args) 
    {
        // ------------------------------- Method 25 ---------------------------------------------

        // char BoothOne [] = {'A', 'A', 'B', 'B', 'B'};
        // char BoothTwo [] = {'A', 'A', 'A', 'A', 'A', 'A'};
        // char BoothThree[] = {'A', 'B', 'B'};

        // char result = getCandidateWithMostVotes(BoothOne, BoothTwo, BoothThree);
        // System.out.println("The Winner is Candidate : " + result);
        
        // ------------------------------- Method 24 ---------------------------------------------

        // char letterOne [] = {'A', 'b', 'c'};
        // char letterTwo [] = {'a', 'b', 'c'};

        // Boolean result = checkIfBothArraysAreSame(letterOne, letterTwo);
        // System.out.println(result);

        // ------------------------------- Method Extra ---------------------------------------------
        
        char newArray [] = new char[40];

        String message = "http://a.com/b from/ submit";
        char letters [] = message.toCharArray();

        int newIndex = 0;
        int index = 0;
        while(index < letters.length)
        {
            newArray[newIndex] = letters[index];
            newIndex++;

            index = index + 1;

        }

        int read = getReadIndex(newArray);
        // System.out.println(read);

        int write = getWriteIndex(newArray, read);
        // System.out.println(write);

        htmlEncoding(newArray, read, write);

        
    }
}
