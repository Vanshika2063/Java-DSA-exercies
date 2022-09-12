import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr= {5, 7, 7, 7, 7, 9, 9, 9, 10, 12, 15};
        int target= 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[]nums, int target){
        int[] ans= {-1, -1};

        ans[0]= search(nums, target, true);
        if(ans[0]!= -1){
            ans[1]= search(nums, target, false);
        }
        return ans;
    }
    static int search(int[] nums, int target, boolean firstStartIndex){
        int ans=-1;
        int start= 0;
        int end= nums.length -1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target>nums[mid]){
                start= mid+1;
            }else {
                ans= mid;
                if(firstStartIndex){
                    end= mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
