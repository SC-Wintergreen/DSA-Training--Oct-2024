import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int position = 3;

        int pivotPoint = arr.length - position;

        int[] newArr = new int[arr.length];
        int k = 0;

        for (int i = pivotPoint; i < arr.length; i++) {

            newArr[k] = arr[i];
            k++;

        }

        for (int i = 0; i < pivotPoint; i++) {
            newArr[k] = arr[i];
            k++;
        }

        System.out.println(Arrays.toString(newArr));
    }

}
