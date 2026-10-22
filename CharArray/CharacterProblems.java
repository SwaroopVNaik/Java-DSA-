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

    // ---------------------------------------------------------------------------------

    static char [] getFullName(char [] firstName, char [] secondName)
    {
        if(firstName ==  null || firstName.length == 0)
        {
            return new char[]{' '};
        }

        if(secondName == null || secondName.length == 0)
        {
            return new char[]{' '};
        }

        int space = 1;
        char fullName [] = new char[firstName.length + secondName.length + space];
        int addIndex = 0;

        int index = 0;
        while(index < firstName.length)
        {
            fullName[addIndex] = firstName[index];
            addIndex = addIndex + 1;

            index = index + 1;
        }

        fullName[addIndex] = ' ';
        addIndex = addIndex + 1;

        int secondIndex = 0;
        while (secondIndex < secondName.length)
        {
            fullName[addIndex] = secondName[secondIndex];
            addIndex = addIndex + 1;

            secondIndex = secondIndex + 1;
        }

        return fullName;
    }

    static char [] getUniquecharcters(char [] firstArray, char[] secondArray)
    {
        if(firstArray == null || firstArray.length == 0)
        {
            return new char[]{' '};
        }

        if(secondArray == null || secondArray.length == 0)
        {
            return new char[]{' '};
        }

        boolean isFound = true;
        int count = 0;
        int index = 0;
        while(index < firstArray.length)
        {
            int jndex = 0;
            while (jndex < secondArray.length) 
            {
                if((char) firstArray[index] == (char) secondArray[jndex])
                {
                    isFound = true;
                    break;
                }

                if((char) firstArray[index] != (char) secondArray[jndex])
                {
                    isFound = false;
                }
                
                jndex = jndex + 1;

            }

            if(isFound == false)
            {
                count = count + 1;
            }

            index = index + 1;
        }

        char [] newArray = new char[count];
        isFound = true;
        int newIndex = 0;

        index = 0;
        while(index < firstArray.length)
        {
            int jindex = 0;
            while(jindex < secondArray.length)
            {
                if(firstArray[index] == secondArray[jindex])
                {
                    isFound = true;
                    break;
                }

                if(firstArray[index] != secondArray[jindex])
                {
                    isFound = false;
                }

                jindex = jindex + 1;
            }

            if(isFound == false)
            {
                newArray[newIndex] = firstArray[index];
                newIndex = newIndex + 1;
            }

            index = index + 1;
        }

        return newArray;
    }

    static int getScore(char [] quizAnswer, char[] answerKey)
    {
        if(quizAnswer == null || quizAnswer.length == 0)
        {
            return  -1;
        }

        if(answerKey == null || quizAnswer.length == 0)
        {
            return -1;
        }

        if(answerKey.length < quizAnswer.length || quizAnswer.length < answerKey.length)
        {
            return -1;
        }

        int CorrectAnswercount = 0;
        int index = 0;
        int jindex = 0;
        while (index < answerKey.length && jindex < quizAnswer.length) 
        {
            if(answerKey[index] == quizAnswer[jindex])
            {
                CorrectAnswercount = CorrectAnswercount + 1;
            }

            index++;
            jindex++;
        }

        return CorrectAnswercount;
    }

    static int getTheNumberOfPositonsWithSameCharacter(char [] wordOne, char [] wordTwo)
    {

        if(wordOne == null || wordOne.length == 0)
        {
            return -1;
        }

        if(wordTwo == null || wordTwo.length == 0)
        {
            return -1;
        }

        if(wordOne.length != wordTwo.length)
        {
            return -1;
        }

        int sameCharacterCount = 0;
        int firstWordIndex = 0;
        while(firstWordIndex < wordOne.length)
        {
            int secondWordIndex = 0;
            while(secondWordIndex < wordTwo.length)
            {
                if(wordOne[firstWordIndex] == wordTwo[secondWordIndex])
                {
                    sameCharacterCount = sameCharacterCount + 1;
                }

                secondWordIndex = secondWordIndex + 1;

            }

            firstWordIndex = firstWordIndex + 1;
        }

        return sameCharacterCount;
    }

    static boolean checkIfTheWordReadsSameForwardAndBackward(char [] word)
    {
        if(word == null || word.length == 0)
        {
            return false;
        }

        boolean result = true;
        int startIndex = 0;
        int lastIndex = word.length - 1;

        while(startIndex <= word.length && lastIndex >= 0)
        {
            if(word[startIndex] >= 'A' && word[startIndex] <= 'Z')
            {
                word[startIndex] = (char) (word[startIndex] - 'A' + 'a');
            }

            if(word[lastIndex] >= 'A' && word[lastIndex] <= 'Z')
            {
                word[lastIndex] = (char) (word[lastIndex] - 'A' + 'a');
            }

            if(word[startIndex] == word[lastIndex])
            {
                result = true;
            }

            if(word[startIndex] != word[lastIndex])
            {
                result = false;
                break;
            }

            startIndex = startIndex + 1;
            lastIndex = lastIndex - 1;
        }

        return result;

    }

    static int [] getPostionOfGivenLetter(char [] word, char key)
    {
        int count = 0;
        int index = 0;
        while(index < word.length)
        {
            if(word[index] == key)
            {
                count = count + 1;
            }

            index = index + 1;
        }

        int [] resultArray = new int [count];
        int resultIndex = 0;

        index = 0;
        while(index < word.length)
        {
            if(word[index] == key)
            {
                resultArray[resultIndex] = index;
                resultIndex++;
            }

            index = index + 1;
        }

        return resultArray;

    }

    static char [] getIncrementedData(char [] letters)
    {
        if(letters == null || letters.length == 0)
        {
            return new char[]{' '};
        }

        int index = 0;
        while(index < letters.length)
        {

            if(letters[index] >= '0' && letters[index] <= '9')
            {
                return new char[]{' '};
            }

            if(letters[index]  >= 'A' && letters[index] < 'Z')
            {
                letters[index] = (char) (letters[index] + 1);
            }

            if(letters[index] >= 'a' && letters[index] < 'z')
            {
                letters[index] = (char) (letters[index] + 1);
            }

            if(letters[index] == 'Z')
            {
                letters[index] = 'A';
            }

            if(letters[index] == 'z')
            {
                letters[index] = 'a';
            }

            index = index + 1;
        }

        return letters;
    }

    boolean checkTheMobileNumber(char [] Mobilenumber)
    {

        if(Mobilenumber == null || Mobilenumber.length == 0)
        {
            return false;
        }

        boolean result = true;
        int count = 0;
        int index = 0;
        while(index < Mobilenumber.length)
        {
            if (Mobilenumber[index] >= '0' && Mobilenumber[index] <= '9') 
            {
                result = true;
            } 
            else 
            {
                result = false;
            }

            if(result == true)
            {
                count = count + 1;
            }

            if(count == 10)
            {
                result = true;
            }
            else
            {
                result = false;
            }

            index = index + 1;
        }

        return result;
    }

    int [] getCountOfSignals(char [] trafficSignals)
    {
        if(trafficSignals == null || trafficSignals.length == 0)
        {
            return new int[]{0, 0, 0};
        }

       int redCount = 0;
       int yellowCount = 0;
       int greenCount = 0;

       int trafficCount [] = new int[3];
       int trafficIndex = 0;

       int index = 0;
       while(index < trafficSignals.length)
       {
            if(trafficSignals[index] == 'R' || trafficSignals[index] == 'r')
            {
                redCount = redCount + 1;
            }

            if(trafficSignals[index] == 'y' || trafficSignals[index] == 'Y')
            {
                yellowCount = yellowCount + 1;
            }

            if(trafficSignals[index] == 'g' || trafficSignals[index] == 'G')
            {
                greenCount = greenCount + 1;
            }

            index = index + 1;
       }

       trafficCount[trafficIndex] = redCount;
       trafficIndex++;

       trafficCount[trafficIndex] = yellowCount;
       trafficIndex++;

       trafficCount[trafficIndex] = greenCount;
       trafficIndex++;

       return trafficCount;
    }
    
    static int getSumOfAllTheDigits(char [] MixtureOfDigitsandAlpha)
    {
        if(MixtureOfDigitsandAlpha == null || MixtureOfDigitsandAlpha.length == 0)
        {
            return 0;
        }

        int sum = 0;
        int index = 0;

        while (index < MixtureOfDigitsandAlpha.length) 
        {
            if(MixtureOfDigitsandAlpha[index] >= '0' && MixtureOfDigitsandAlpha[index] <= '9')
            {
                sum = sum + MixtureOfDigitsandAlpha[index] - '0';
            }

            index = index + 1;
        }

        return sum;
    }

    static int getNumberOfStudentsGotAGrade(char [] grades)
    {
        if(grades == null || grades.length == 0)
        {
            return 0;
        }

        int CountGradeA = 0;
        int index = 0;

        while(index < grades.length)
        {
            if(grades[index] == 'A' || grades[index] == 'a')
            {
                CountGradeA = CountGradeA + 1;
            }

            index = index + 1;
        }

        return CountGradeA;
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

    static void printArrayint(int [] letter)
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
        Scanner scanner = new Scanner(System.in);

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

        // ------------------------------- HTML ENCODING --------------------------------
        
        // char newArray [] = new char[40];

        // String message = "http://a.com/b from/ submit";
        // char letters [] = message.toCharArray();

        // int newIndex = 0;
        // int index = 0;
        // while(index < letters.length)
        // {
        //     newArray[newIndex] = letters[index];
        //     newIndex++;

        //     index = index + 1;

        // }

        // int read = getReadIndex(newArray);
        // // System.out.println(read);

        // int write = getWriteIndex(newArray, read);
        // // System.out.println(write);

        // htmlEncoding(newArray, read, write);

        // ------------------------------- Method 23 ----------------------------------

        // char [] firstName = {'p', 'r', 'a', 'v', 'e', 'e', 'n'};
        // char [] secondName = {'M'};

        // char [] result = getFullName(firstName, secondName);
        // printArray(result);

        // ------------------------------- Method 22 ----------------------------------

        // char [] firstArray = {'A', 'b', '7', 'a', '#', 'M', 'b', '9', 'Z', '@', 'c', '7', 'X'};
        // char [] secondArray = {'b', 'Z', '9', '@', 'M', '7'};

        // char result [] = getUniquecharcters(firstArray, secondArray);
        // printArray(result);

        // ------------------------------- Method 21 ----------------------------------

        // char [] quizAnswer = {'A', 'C', 'B', 'D', 'A'};
        // char [] answerKey = {'A', 'B', 'B', 'D', 'C'};

        // int result = getScore(quizAnswer, answerKey);
        // System.out.println("The Quiz is result is : " + result);

        // ------------------------------- Method 20 ----------------------------------
        // char [] wordOne = {'r', 'o', 'h', 'a', 'n', 't', 'h'};
        // char [] wordTwo = {'p', 'a', 'r', 'v', 'e', 'e', 'n'};

        // int result = getTheNumberOfPositonsWithSameCharacter(wordOne, wordTwo);
        // System.out.println(result);

        // ------------------------------- Method 19 ----------------------------------

        // char [] word = {'C', 'I', 'V', 'I', 'C'};
        // boolean result = checkIfTheWordReadsSameForwardAndBackward(word);
        // System.out.println(result);

        // ------------------------------- Method 18 ----------------------------------

        // char [] word = {'r', 'o', 'h', 'a', 'n', 't', 'h'};
        // char key = 'h';

        // int [] position = getPostionOfGivenLetter(word, key);
        // printArrayint(position);
        
        // ------------------------------- Method 17 ----------------------------------

        // char [] letters = {'a', 'b', 'c', 's'};
        // char [] resultLetters = getIncrementedData(letters);
        // printArray(resultLetters);

        // ------------------------------- Method 16 ----------------------------------

        // char [] Mobilenumber = {'9','8','4','5','0','1','2','3'};

        // CharacterProblems object = new CharacterProblems();

        // boolean result = object.checkTheMobileNumber(Mobilenumber);

        // System.out.println(result);

        // ------------------------------- Method 15 -----------------------------------

        // char [] trafficSignals = {'R','G','G','y','R','G'};

        // CharacterProblems object = new CharacterProblems();

        // int [] result = object.getCountOfSignals(trafficSignals);
        // printArrayint(result);

        // ------------------------------- Method 14 ------------------------------------

        // char [] MixtureOfDigitsandAlpha = {'a','3','b','7','2'};

        // int result = getSumOfAllTheDigits(MixtureOfDigitsandAlpha);
        // System.out.println(result);

        // ------------------------------- Method 13 ------------------------------------

        // char [] grades = {'A','B','A','C','A','B'};
        // int result = getNumberOfStudentsGotAGrade(grades);
        // System.out.println(result);

        // ------------------------------- Method 12 ------------------------------------

        // char [] letters = {'d', 'o', 'g', 's'};
        







    }
}
