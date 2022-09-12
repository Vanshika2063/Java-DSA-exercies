public class ceiling {
    public static void main(String[] args) {
        int[] arr= {2, 5, 6, 7, 10, 15, 16, 17, 23, 29};
        int target= 15;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
//        edge case
        if(target>arr[arr.length -1]){
            return -1;
        }

        int start= 0;
        int end= arr.length -1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else {
                start= mid + 1;
            }
        }
        return start;
    }

}
