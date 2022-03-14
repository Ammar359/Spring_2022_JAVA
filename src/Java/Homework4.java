/**
 * Task -1
 * using Ternary operator assign value to int-variable
 *
 * Variable -> result1
 * if the length of sentence1-String is greater or equals to 5
 *      value in result1 should be 10
 * else
 *      value in result should be 15
 *
 * print:
 *      value of sentence1
 *      length of sentence1
 *      value of result1
 */

package Java;

import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {

        int result1 = 10;
        int result = 15 , res;
        String sentence1 = "New York Post";
        System.out.println("Value of Sentence1 = " + sentence1 );
        System.out.println("Length of sentence1 = "+ sentence1.length() );



        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */

        String name = "Ammar Ashraf";
        System.out.println("Length of name = " + name.length());
        System.out.println("Name ends with = "+ name.endsWith("a"));
        System.out.println("Name contains =" + name.contains("a"));

        /**
         * Task 3
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";

        System.out.println("task 3 value contains = " + task3.contains("king"));
        System.out.println("index of first occurrence of EW = "+ task3.equalsIgnoreCase("king")+task3.indexOf("EW"));


        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String task4 = "kING";
        System.out.println("Original Word = "+ task4 );
        String output = task4.substring(0, 1).toUpperCase() + task4.substring(1).toLowerCase();
        System.out.println("Output = " + output);

        String task5 = "QUEEN";
        System.out.println("Original Word = "+ task5 );
        String outPut = task5.substring(0, 1).toUpperCase() + task5.substring(1).toLowerCase();
        System.out.println("Output = " + outPut);


    }
}




