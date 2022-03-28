package Java;

public class Homework7 {
    public static void main(String[] args) {
        /**
         * First answer
         */

        String name1 = "make america great again";
        System.out.println("make america great again = " + makeAbbreviation(name1));
        String name2 = "outfit of the day";
        System.out.println("outfit of the da = " + makeAbbreviation(name2));
        String name3 = "Good Morning";
        System.out.println("Good Morning = " + makeAbbreviation(name3));
        String name4 = "happy birthday to you dear";
        System.out.println("happy birthday to you dear = " + makeAbbreviation(name4));
        String name5 = "happy new year to you dear";
        System.out.println("happy new year to you dear = " + makeAbbreviation(name5));



        /**
         * Second Answer
         */


        String firstSen = "HappY nEW YEAR to YoU dEAr";
        Homework7 ttC = new Homework7();
        String inputRes = ttC.makeTitleCase(firstSen);
        System.out.println(firstSen);



/**
 * Third Answer
 */


        int[] sum1 = {23, 54, 76, 12, 67, 90, 23};
        int[] sum2 = {23, 54, 76, 12};
        int[] sum3 = {-2, -9, -4, -7, -9, -55};

        System.out.println(" The max value of given array = " + findMaxArray(sum1));
        System.out.println(" The max value of given array = " + findMaxArray(sum2));
        System.out.println(" The max value of given array = " + findMaxArray(sum3));



/**
 * Fourth Answer
 */


        String word1 = "Eye";
        String word2 = "eye";
        String word3 = "fall";
        String word4 = "Level";
        String word5 = "level";
        String word6 = "hello";
        Homework7 ccp = new Homework7();
        boolean checkForPalindrome1 = ccp.checkForPalindrome(word1);
        System.out.println(checkForPalindrome1);
        boolean checkForPalindrome2 = ccp.checkForPalindrome(word2);
        System.out.println(checkForPalindrome2);
        boolean checkForPalindrome3 = ccp.checkForPalindrome(word3);
        System.out.println(checkForPalindrome3);
        boolean checkForPalindrome4 = ccp.checkForPalindrome(word4);
        System.out.println(checkForPalindrome4);
        boolean checkForPalindrome5 = ccp.checkForPalindrome(word5);
        System.out.println(checkForPalindrome5);
        boolean checkForPalindrome6 = ccp.checkForPalindrome(word6);
        System.out.println(checkForPalindrome6);




        /**
         * Fifth Answer
         */


        String[] givenString = {"happy", "Happy new year", "peaceful" , "king kong"};
        System.out.println("The longest string in given array-string is --> " + findLongestString(givenString));

    }





    /**
     * Q1:
     * Create a method to make abbreviation for a given sentence
     */


    public static String makeAbbreviation(String inputStr) {

        String[] nameSplit = inputStr.split(" ");
        String abvRes = "";

        for (int i = 0; i < nameSplit.length; i++) {
            abvRes += nameSplit[i].substring(0,1).toUpperCase();

        }
        return abvRes;
    }

    /**
     * Q2:
     * Create a method that will change the given sentences in Titlecase
     */

    public static String makeTitleCase(String stringInput) {
        String inputRes = " ";
        stringInput = stringInput.toUpperCase();
        String[] newWord1 = stringInput.split(" ");
        for (int i = 0; i < newWord1.length; i++) {
            inputRes += newWord1[i].substring(0) + newWord1[i].substring(1);

        }
        return inputRes.trim();
    }

    /**
            * Q3:
            * Create method to find the maximum value from given int-array
     */


        public static int findMaxArray(int[] intInput) {
        int maxRes = intInput[0];
        for (int i = 0; i < intInput.length; i++)
            if (maxRes < intInput[i]) {
                maxRes = intInput[i];

            }
        return maxRes;
    }

    /**
     * Q4:
     * Create a method to find if the given string is palindrome (DO NOT ignore case)
     * Method should return (boolean)
     */

    public boolean checkForPalindrome (String checkWords){
        String revName1 = "";
        for (int i = checkWords.length()-1 ; i >= 0 ; i--){
            revName1 += checkWords.charAt(i);
        }
        boolean result = checkWords.equals(revName1);
        return result;
    }
/**
 * Q5:
 * Create a method to find the longest String in the given String-array
*/

public static String findLongestString (String[] givenString){
    String resString = givenString[0];
    for (int i = 0; i < givenString.length; i++){
        if (givenString[i].length() > resString.length()){
            resString = givenString[i];

        }
    }
    return resString;
}
  }





