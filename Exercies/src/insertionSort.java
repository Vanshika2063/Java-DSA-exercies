import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr= {5, 7, 2, 4, 1, 3, 6, 8};
        insertion(arr);
    }
    static void insertion(int[] arr){
//        5, 7, 2, 4, 1, 3, 6, 8
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
