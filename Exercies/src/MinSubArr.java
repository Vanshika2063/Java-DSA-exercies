public class MinSubArr {
    public static void main(String[] args) {
        int[] arr= {2,3,1,2,4,3};
        int target= 12;
        System.out.println(minSubArrayLen(target, arr));
    }
    static int minSubArrayLen(int target, int[] arr){
//        2,3,1,2,4,3
        int sum=0;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 1; j < arr.length;) {
                sum= sum+ arr[i]+arr[j];
                if(sum==7 || sum>7){
                    return sum;
                }else {
                    j++;
                }
            }

        }
        return -1;
    }
}
