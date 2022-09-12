public class searchPM {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,1};
        int target= 4;
        System.out.println(search(arr,target));
    }
    static int findPeak(int[] arr){
        int start= 0;
        int end= arr.length -1;
        while (start<end){
            int mid= start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end= mid;
            }else {
                start= mid+1;
            }
        }
        return start;
    }

    static int search(int[] arr, int target){
        int peakIndex= findPeak(arr);
        int firstHalf= orderAgnostic(arr, target, 0, peakIndex);
        if (firstHalf != -1){
            return firstHalf;
        }
        return orderAgnostic(arr, target, peakIndex+1, arr.length -1);
    }

    static int orderAgnostic(int[] arr, int target, int start, int end){
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
