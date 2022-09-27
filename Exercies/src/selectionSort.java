import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr= {5, 4, 2, 1, 3, 6, 7};
        selection(arr);


    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int max= maxFind(arr, 0, last);
            swap(arr, max, last)    ;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int maxFind(int[] arr, int start, int end){
        int max= start;
        for (int i = start; i <= end; i++) {
            if (arr[start]<arr[i]){
                max= i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
