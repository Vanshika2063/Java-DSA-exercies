public class binarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 6, 7, 10, 15, 16, 17, 23, 29};
        int[] arr2 = {28, 27, 26, 23, 21, 19, 17, 16, 14, 11};
        int target = 19;
        System.out.println(orderAgnostic(arr2, target));
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending= arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(isAscending){
                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (arr[mid]==target){
                    return mid;
                } else if (arr[mid] < target) {
                    end= mid-1;
                }else {
                    start= mid +1;
                }
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int start= 0;
        int  end= arr.length -1;
        while (start<=end){
            int mid= start+(end -start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }
}
