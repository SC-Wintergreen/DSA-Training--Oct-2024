import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 6, 7, 5, 3, 1, 9, 8, 4 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}