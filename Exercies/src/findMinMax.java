
public class findMinMax {
    public static void main(String[] args) {
        int[] arr= { 4, 32, 7, 5, 92, 54, 59, 1, 84, 9};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int min= 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< arr[min]){
                min= i;
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max= 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }
}
