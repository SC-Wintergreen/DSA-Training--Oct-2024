public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 6, 7, 8, 9, 5 };
        int el = 5;
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == el) {
                break;
            }
        }

        System.out.println(i);

    }
}