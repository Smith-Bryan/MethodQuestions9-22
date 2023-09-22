package groupBwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static String main(String[] args) {
        String names[] = {"Johnny","Roger","Albert","Rico"};



        public static int getLastIndex(String[] names) {

            return names.length -1;
        }


        public static int getSecondToLastIndex(String[] names) {

                return names.length -2;
        }


        public static String getFirstElement(String[] names) {
            return names[0];
        }

        public static String getLastElement(String[] names) {
            return names[names.length -1];
        }


        public static String getSecondToLastElement(String[] names) {
            return names [names.length -2];
        }


        public static int getSum(int[] ints) {
            int sum = 0;
            for(int i : ints){
                sum += i;

            }
            return sum;
        }

        public static int getAverage(int[] ints) {
            int sum = 0;
            for(int i : ints){
                sum = sum + i;
            } getAverage = sum / ints.length;
            return getAverage;
        }

        public static String extractAllOddNumbers(int[] numbers) {
            String oddNumbers = " ";
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] % 2 != 0);//for the current element modulo by 2 if doesnt equal zero it is an odd number
            oddNumbers += numbers[i];
            }
        }

        public static String extractAllEvenNumbers(int[] numbers) {
            String evenNumbers = " ";
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] % 2 == 0);
                evenNumbers += numbers[i];
        }

        public static boolean contains(String[] names, String element) {
                for(int i = 0; i < names.length; i++);{
                    if(names[i].equals(element)){
                        return true;
                    }
                }
            return false;
            }

        }

        public static int getIndexByElement(String[] names, String element) {
            for(int i = 0; i < names.lengths; i++)
                if(names[i].equals(element)){
                    return i;
                }
            return -1;
        }

        public static void printOddNumbersInRange(int start, int end){
           for(int i = start; i <= end; i++);
           if(i % 2 != 0){
               System.out.println(i);
           }


        }

        public static String printGivenStringTimesNumberGiven(String str, int n) {
            String string =  " ";
            for(int i = 0; i < n; i++){
                string += str + " ,";
            }
            return String;
        }

        public static String repeatFirstThreeLetters(String str, int n) {
            String substring = " ";
            for(int i = 0; 1 < n; i++)
                substring += str.substring(0,3) + ", ";

            return substring;
        }

// Write a java method to count all the words in a string
        public static int WordsInAStringCounter(String str){
            //there is a cat --> there are 4 words and 3 spaces
          int totalWords = 0; //word counter
          String  regex = " "; //regex uses spaces to identify number of words
            Pattern pattern= pattern.compile(regex); //use regex pattern to identify pattern in a string "Empty spaces"
            Matcher matcher = pattern.matcher(str); //allows us to observe string and use pattern on string
        }
        while(matcher.find()){
            totalWords++;
        }
        return totalWords + 1;
        }



        //  A, E, I, O, U, and sometimes Y



        public static int VowelsCounter(String str){

            return 0;

        }





        Swap the first element in an array with the last element in an array and return



        public static String[] swap(String[] stringArray) {

            return null;

        }



/**

 * Given the following legend

 *

 * f >> 7

 * s >> $

 * 1 >> !

 * a >> @

 *

 * your method should replace any character represented by a key in the legend, with its corresponding value.

 * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"

 * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"

 *

 * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer

 */



        public static String replaceCharacters(String str) {

            return null;

        }



        " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "



        public static String replaceWuTangTwoThreeDivisible(String stringInput) {

            return null;

        }




        public static String createStringOfFibonnaciUpToMax(int maxnumber) {

            return null;

        }
        System.out.println(getSecondToLastElement(names));


    }


    }

