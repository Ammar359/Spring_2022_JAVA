package Java;

import java.util.Arrays;
import java.util.stream.IntStream;

import static Java.Code_Test_2.arr1;

class Code_Test_3 {

    public static int[] removeTheElement(int[] arr, int index)
    {


        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }


        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }


    public static void main(String[] args)
    {

        int[] arr = {11,22, 33, 44, 55};


        System.out.println("Original Array: "
                + Arrays.toString(arr));


        int index = 0;

        // Print the index
        System.out.println("Index to be removed: "
                + index);

        // Remove the element
        arr= removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }





    public static <int1> int[] removeTheElement(int1[] arr, int index)
    {


        if (arr1 == null
                || index < 0
                || index >= arr1.length) {

            return arr1;
        }


        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr1[i])
                .toArray();
    }


    {

        int[] arr1 = { 23, 5, 67, 87, 10, 5, 34, 98, 66, 55 };


        System.out.println("Original Array: "
                + Arrays.toString(arr1));


        int index = 1;

        // Print the index
        System.out.println("Index to be removed: "
                + index);

        // Remove the element
        arr1 = removeTheElement(arr1, index);

        // Print the resultant array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr1));

}
}

