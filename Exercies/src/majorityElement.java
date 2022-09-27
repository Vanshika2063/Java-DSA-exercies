import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr  = {2,2,1,1,1,2,2};
        System.out.println(element(arr));
    }
    static int element(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}
