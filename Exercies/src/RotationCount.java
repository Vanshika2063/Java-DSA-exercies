public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 15, 16, 2, 4, 5, 7, 9};
        System.out.println(pivotIndex(arr));
    }

    static int pivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//           [ 3, 4, 5, 6, 0, 1, 2 ]
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (start < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
