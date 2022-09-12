public class RBS {
    public static void main(String[] args) {
        int[] arr= {10,11,12,15,16,2,4, 5,7,9};
        int target= 4;
        System.out.println(search(arr, target));
    }

    static int pivotIndex(int[] arr) {
        int start= 0;
        int end= arr.length -1;
        while (start<=end){
            int mid= start+(end-start)/2;
//           [ 3, 4, 5, 6, 0, 1, 2 ]
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(start<end && arr[mid]<arr[mid-1]){
                return  mid-1;
            }if(arr[mid]<=arr[start]){
                end= mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot= pivotIndex(arr);
        int firstHalf= bs(arr, target, 0, pivot);
        if(firstHalf == -1){
            return bs(arr, target, pivot+1, arr.length -1);
        }
        return firstHalf;
    }

    static int bs(int[] arr, int target, int start, int end){
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

}
