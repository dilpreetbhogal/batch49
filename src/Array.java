import java.util.Arrays;
public class Array {

    public static void main(String[] args) {

         int arr[] = new int[5];
         int[] arr2 = new int[5];
         int[] arr3 = new int[]{10,20,30};
         int arr4[] = new int[]{20,30,50,60};
         int [] arr5 = {1,2,3,5,6};

        int length = arr.length;
        System.out.println(length);
        System.out.println(Arrays.toString(arr)); //printing the value of array...by importing Arrays Util and then stringified
                                                  // the array to see the value stored in array

    }
}
