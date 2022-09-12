import java.util.Arrays;

public class customWealth {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr) {
        int ans= Integer.MIN_VALUE;
        for (int[] a: arr) {
            int sum=0;
            for (int b: a) {
                sum+= b;
            }
            if(sum>ans){
                ans= sum;
            }
        }
        return ans;
    }
}
