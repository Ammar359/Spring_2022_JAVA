package Java;

import java.util.Arrays;

public class Code_Test1 {
    public static void main(String[] args) {
        /**
         * Ques-1:
         * Create a method to return an int-array after sorting a given input-int-array
         * points: 10
         */
        /*
         *
         * eg:
         * input -> [32, 54, 12, 67, 2, 5]
         * returned array -> [2, 5, 12, 32, 54, 67]

         */
        int arr[] = {32, 54, 12, 67, 2, 5};
        System.out.println("Before Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println();

        System.out.println("After Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }
        int arr1[] = {5, 4, 3, 1, 2};
        System.out.println("Before Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        Arrays.sort(arr1);

        System.out.println();

        System.out.println("After Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        int arr2[] = {90, 34, 12, 4};
        System.out.println("Before Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        Arrays.sort(arr2);

        System.out.println();

        System.out.println("After Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

        int arr3[] = {32, 54, 12, 67, 2, 5};
        System.out.println("Before Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        Arrays.sort(arr3);

        System.out.println();

        System.out.println("After Sorting");
        System.out.println("--------------");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");

        }
    }
}