import java.util.Arrays;

public class RotateArrayOptimized {

    public static void reverseArray(int[] arr, int start, int end) {

        int arrLen = end - start + 1;

        for (int i = start; i < arrLen / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[arrLen - 1 - i];
            arr[arrLen - 1 - i] = swap;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int pos = 2;

        int pivotIndex = arr.length - pos;

        reverseArray(arr, 0, pivotIndex - 1);

        reverseArray(arr, pivotIndex, arr.length - 1);

        reverseArray(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

}
