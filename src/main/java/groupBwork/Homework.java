package groupBwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {


    //Question 1    index[0,1,2,3,4]
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //Question 6
    public static int getSum(int[] ints) {

        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        return sum;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String extract = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                extract += numbers[i];
            }
        }

        return extract;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String extract = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                extract += numbers[i];
            }
        }

        return extract;
    }

    //Question 10
    public static boolean contains(String[] names, String element) {


        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //Question 11




    public static int getIndexByElement(String[] names, String element) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //Question 12
    public static void printOddNumbersInRange(int start, int end) {

        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {


        String stringBuild = " ";
        for (int i = 0; i < n; i++) {
            stringBuild += str + " , ";
        }
        return stringBuild;
    }

    // Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String subString = "";
        for (int i = 0; i < n; i++) {
            subString += str.substring(0, 3) + " , ";
        }
        return subString;
    }

    //Question 15

    public static int WordsInAStringCounter(String str) {
        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter + 1;
    }

    // Question 16
    // A, E, I, O, U, and sometimes Y


    public static int VowelsCounter(String str) {
        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(str);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;


    }


    ///  Question 17

    //Swap the first element in an array with the last element in an array and return


    public static String[] swap(String[] stringArray) {
        String firstElement = stringArray[0];
        String lastElement = stringArray[stringArray.length - 1];
        stringArray[0] = lastElement;
        stringArray[stringArray.length - 1] = firstElement;
        return  stringArray; // YOU RETURN STRING ARRAY SO YOU CAN PRINT THE METHOD

    }

    //  Question 18

    /**
     * Given the following legend
     * <p>
     * <p>
     * <p>
     * f >> 7
     * <p>
     * s >> $
     * <p>
     * 1 >> !
     * <p>
     * a >> @
     * <p>
     * <p>
     * <p>
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * <p>
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * <p>
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     * <p>
     * <p>
     * <p>
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */


    public static String replaceCharacters(String str) {
        /*
        Step 1 create char array
        Step 2: turn str into a char array to do this use str.toCharArray
        Step 3 : assign the str.toCharArray to char array
        Step 4: Use for loop to iterate through char array
        Step 5 for each element if one of the elements are equal to thhe element that need to be changed change the element
        Step 6 after for loop
         */
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'f' || charArray[i] == 'F') {
                charArray[i] = '7';
            } else if (charArray[i] == 'S' || charArray[i] == 's') {
                charArray[i] = '$';
            } else if (charArray[i] == 'S' || charArray[i] == 's') {
                charArray[i] = '$';
            } else if (charArray[i] == '1') {
                charArray[i] = '!';
            } else if (charArray[i] == 'A' || charArray[i] == 'a') {
                charArray[i] = '@';
            }
        }

        String result = new String(charArray);
        return result;
    }


    // Question 19
    //  THIS IS WHAT WE HAVE TO WORK WITH index position                            0   1     2      3   4     5    6                0   1  2   3   4     5   6
    //  THIS IS WHAT WE WANT TO WORK WITH element num                               1   2     3      4   5     6    7                1   2  3   4   5     6   7    WE  CANT USE THIS           2 and 4 are divisible by 2 so change to wu   3 is divisible by 3 so change to tang      6 is divisible by 2 and 3 but we prioritize 2 so change it to wu
    //  IN ORDER TO WORK WITH element num, we have to set i = 1 and offset by -1 " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        /*
        1. turn the String into a string array. with each element being its own word
        2. loop through the array and check the index position of the element
        3. if the index position of the element is divisible by 2 (using the % 2 == 0), change element to "wu"
        4. else if the index position of the element is divisible by 3 (using the % 3 == 0), change the element to "tang"
        5. return back the string.
         */

        String[] words = stringInput.split(" "); //for every word, make it an element and store it in the array.

        for (int i = 1; i <= words.length; i++ ){
            if(i % 2 == 0 && i != 0) {
                words[i-1] = "wu";
            }
            else if (i % 3 == 0 && i != 0) {
                words[i-1] = "tang";
            }
        }
        String newString = Arrays.toString(words);
        return newString;
    }

    // Question 20

    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        /*
        fibonnaci sequence states that the current num is the sum of the past two numbers (example: 1 1 2 3 5)
        we will create the sequence with a String builder
        create for loop that will build the string.
        sum = previousNum + nextNum <- important to keep up with the sequence.
        previousNum = nextNum;
        nextNum = sum;  -^> we are just moving the elements of the past two to keep up with the fibonnaci sequence.
         */
        String builder = " ";
        int previousNum = 0;
        int nextNum = 1;
        for(int i = 0;i < maxnumber; i++){ // 0 1 2 3 4 5
            builder += previousNum + " ";
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }

        return builder;

    }


        public static void main(String[] args) {


            String names[] = {"Johnny", "Roger", "Albert", "Rico"};

            System.out.println( Arrays.toString(swap(names)));
            System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
            System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
            System.out.println( createStringOfFibonnaciUpToMax(5));
        }
    }

