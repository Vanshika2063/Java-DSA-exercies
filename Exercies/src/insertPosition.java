public class insertPosition {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        int target= 4;
        System.out.println(searchInsert(arr, target));
    }
    static int searchInsert(int[] num, int target) {
        int start=0;
        int end= num.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;

            if(num[mid]==target){
                return mid;
            }
            if(num[mid]>target){
                end= mid-1;
            }
            if(num[mid]<target){
                start=mid+1;
            }
        }
        return start;
    }
}
