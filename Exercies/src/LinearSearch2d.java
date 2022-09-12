import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] arr={
                {8, 5, 7, 12},
                {32, 74, 4},
                {6, 1, 3, 88, 41, 19},
                {3, 0}
        };
        int target= 91;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
