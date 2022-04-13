import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework10 {
    public static void main(String[] args) {

        /**
         * Question-1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         */
          // create String-List using given-String-Array


        /** create a String-Set using String-List
         * compare size of Set and List
         */


        /**
         * Question-2:
         * Create a method that would return the duplicate values of given-String-array (ignore the case)
         *
         * Input: String-Array
         * Return type:     (one of these -> Array, List, Set)
         *
         *
         * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
         *
         * "abc", "def"
         */

        {
            // String Arrays
            String[] strArrays = {"abc", "abc", "DEF", "ABC", "XYZ", "def"};

            // First convert to List
            List<String> list = Arrays.asList(strArrays);

            // Then convert to Set
            Set<String> set = new HashSet<String>(list);

            // check String Arrays length and HashSet size
            int strArrayLength = strArrays.length;
            int setSize = set.size();

            for (int i = 0; i < strArrays.length - 1; i++) {
                for (int j = i + 1; j < strArrays.length; j++) {
                    if ((strArrays[i].equalsIgnoreCase(strArrays[j])) && (i != j)) {
                        System.out.println("Duplicate Element is : " + strArrays[j]);
                    }
                }

            }
        }
    }
    }