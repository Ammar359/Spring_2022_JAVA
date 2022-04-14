import java.util.*;

public class Homework10_Question1{
        public static void main(String[] args) {

    String[] names = new String[0];
    System.out.println("duplicate array" + isArrayHasDuplicates(names));

}
        /**
         * Question-1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         */
        // create String-List using given-String-Array


        /**
         * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */

        String[] words = {"peace", "grow", "joy", "peace","happy", "laugh"};

        public static boolean isArrayHasDuplicates(String[] inputArray) {
            boolean isArrayDup = true;
            // now convert string to list

            List<String> names = new ArrayList<>(Arrays.asList(inputArray));
            System.out.println(names.size());

            // now list convert to Set
            Set<String> setNames = new HashSet<>(names);

            int arrayLength = inputArray.length;
            int setNamesSize = setNames.size();
            // now compare both lengths


            //isArrayDup = arrayLength ==setNamesSize;
            return arrayLength == setNamesSize;


        }




}
