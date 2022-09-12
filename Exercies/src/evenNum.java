public class evenNum {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums) {
        int evenCount= 0;
        for(int num : nums){
            int digitCount = 0;
            while (num > 0){
                digitCount++;
                num /= 10;
            }
            evenCount = digitCount % 2 == 0 ? evenCount +1 : evenCount;
        }
        return evenCount;
    }
}
