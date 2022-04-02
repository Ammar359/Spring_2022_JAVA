package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Code_Test_4 {
    static void FindCommonElemet(String[] arr1,
                                 String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args)
    {

        // create Array 1
        String[] arr1
                = { "happy", "king", "peace", "peace", "living standard" };

        // create Array 2
        String[] arr2 = { "king kong", "happy", "peace" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElemet(arr1, arr2);
    }







}
