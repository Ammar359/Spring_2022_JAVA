public class Code_Test_Ans2 {
    static int arr[] = { 1,2,3 };

    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                + sum());

        System.out.println("Sum of given array is "
                + sum1());

        System.out.println("Sum of given array is "
                + sum2());
    }

    public static int arr1[] = { 3,2,3 };

    // method for sum of elements in an array
    static int sum1()
    {
        int sum1 = 0; // initialize sum
        int i;

        for (i = 0; i < arr1.length; i++)
            sum1 += arr1[i];

        return sum1;
    }
    public static int arr2[] = { 9,0 };

    // method for sum of elements in an array
    static int sum2() {
        int sum2 = 0; // initialize sum
        int i;

        for (i = 0; i < arr2.length; i++)
            sum2 += arr2[i];

        return sum2;

    }





}
