package Java;

public class Homework6 {
    public static void main(String[] args) {

        /*
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1

         */
        int [] minNumber = {-1, 1};
        int minimumNum = minNumber[0];
        for(int x : minNumber ){
            if (x < minimumNum) {
                minimumNum = x;
            }
        }
        System.out.println("Minimum Value " + minimumNum);


        // int[] numbers = {1, 21, 87, 23};

        int [] numbers = {1, 21, 87, 23};
        int minimum = numbers[0];
        for(int x : numbers ){
            if (x < minimum) {
                minimum = x;
            }
        }
        System.out.println("Minimum Value " + minimum);

        // int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
        int [] numbers1 = {87, 23, 89, 0, 54, 23};
        int minimum1 = numbers1[0];
        for(int x : numbers1 ){
            if (x < minimum1) {
                minimum1 = x;
            }
        }
        System.out.println("Minimum Value " + minimum1);



       /** Q
               * Convert the String value in to Titlecase
               *
               * make america great again -> Make America Great Again
               * gOOd morNING -> Good Morning
               * learn -> Learn
               * happy birTHday TO yOu -> Happy Birthday To You
               *
               */

        String str = "make america great again";
        String[] words =str.split("\\s");
        String capitalizeStr="";

        for(String word:words){

            String firstLetter=word.substring(0,1);     // Capitalize first letter

            String remainingLetters=word.substring(1);       // Get remaining letter
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);

        // gOOd morNING -> Good Morning


        String strLetter = "good morning";
        String[] wordName =strLetter.split("\\s");
        String capitalizeFirstStr="";

        for(String word:wordName){

            String firstLetter=word.substring(0,1);     // Capitalize first letter

            String remainingLetters=word.substring(1);       // Get remaining letter
            capitalizeFirstStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeFirstStr);


        // learn -> Learn

        String strFirstLetter = "learn";
        String[] wordFirstLetter =strFirstLetter.split("\\s");
        String capitalizeStrLetter="";

        for(String word:wordFirstLetter){

            String firstLetter=word.substring(0,1);     // Capitalize first letter

            String remainingLetters=word.substring(1);       // Get remaining letter
            capitalizeStrLetter+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStrLetter);

        // happy birTHday TO yOu

        String strLetterNew = "happy birTHday TO you";
        String[] wordLetter =strLetterNew.split("\\s");
        String capitalizeLetter="";

        for(String word:wordLetter){

            String firstLetter=word.substring(0,1);     // Capitalize first letter

            String remainingLetters=word.substring(1);       // Get remaining letter
            capitalizeLetter+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeLetter);


        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make

         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */

        String input = "make america great again";
        String output = "";
        String[] array = input.split(" ");
        for(int i = array.length-1; i >= 0; i--)
        {
            output += array[i];
            if (i != 0) { output += " "; }
        }
        System.out.println("Reverse Word = "+ output);



        String originalInput = "happy birthday to you";
        String originalOutput = "";
        String[] originalArray = originalInput.split(" ");
        for(int i = originalArray.length-1; i >= 0; i--)
        {
            originalOutput += originalArray[i];
            if (i != 0) { originalOutput += " "; }
        }
        System.out.println("Reverse Word = "+ originalOutput);

        // good Morning -> Morning good

        String inputWord = "Morning good";
        String outputWord = "";
        String[] arrayWord = inputWord.split(" ");
        for(int i = arrayWord.length-1; i >= 0; i--)
        {
            outputWord += arrayWord[i];
            if (i != 0) { outputWord += " "; }
        }
        System.out.println("Reverse Word = "+ outputWord);



        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         */

        String abbrevWord = "Good Morning";
        String abbrevName = abbrevWord.toUpperCase();
        String [] names = abbrevName.split(" ");

        System.out.println(names[0].charAt(0) + "" +names[1].charAt(0));

        //  Air ballon

        String abbrevWord3 = "Air ballon";
        String abbrevName3 = abbrevWord3.toUpperCase();
        String [] name3 = abbrevName3.split(" ");

        System.out.println(name3[0].charAt(0) + "" +name3[1].charAt(0));

        // make america great again

        String abbrevNewWord = "make america great again";
        String abbrevNewName = abbrevNewWord.toUpperCase();
        String [] name = abbrevNewName.split(" ");
        System.out.println(name[0].charAt(0) + "" +name[1].charAt(0) +""+name[2].charAt(0) +"" +name[3].charAt(0));


        //hello
        String abbrevWord2 = "hello";
        String abbrevName2 = abbrevWord2.toUpperCase();
        String [] names2 = abbrevName2.split(" ");

        System.out.println(names2[0].charAt(0));

        //happy birthday to you dear friend

        String abbrevWord1 = "happy birthdday to you dear friend";
        String abbrevName1 = abbrevWord1.toUpperCase();
        String [] name1 = abbrevName1.split(" ");
        System.out.println(name1[0].charAt(0) + "" +name1[1].charAt(0) +""+name1[2].charAt(0) +"" +name1[3].charAt(0)+""+name1[4].charAt(0)+""+name1[5].charAt(0));


    }
}