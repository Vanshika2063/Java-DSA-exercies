public class infinityArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 10, 12, 13, 14, 17, 19, 20, 22, 29};
        int target = 13;
        System.out.print(giveRange(arr, target));

    }

    static int giveRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length-1 && target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        if(end > arr.length-1){
            return bs(arr, target, start, arr.length-1);
        }
        return bs(arr, target, start, end);
    }

    static int bs(int[] arr, int target, int start, int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
