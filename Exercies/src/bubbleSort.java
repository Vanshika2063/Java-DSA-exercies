import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 10, 0, 1, 3, 9};
        serialVise(arr);
    }

    static void serialVise(int[] arr) {
        boolean swapped;
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            swapped= false;
            for (int j = 1; j < arrLen - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swipe(arr, j);
                    swapped= true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swipe(int[] arr, int j) {
        int temp=arr[j] ;
        arr[j]=arr[j-1];
        arr[j-1]= temp;
    }
}
