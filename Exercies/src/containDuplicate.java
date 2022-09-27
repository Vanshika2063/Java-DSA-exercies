public class containDuplicate {
    public static void main(String[] args) {
        int[] arr= {1,1,1,3,3,4,3,2,4,2};
    }

    static boolean duplicate(int[] nums){
        int i= 0;
        while(i< nums.length){
            int correct= nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return true;
            }
        }
        return false;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
