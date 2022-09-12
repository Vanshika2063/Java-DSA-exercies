import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int target= 4;
        int[][]  arr= {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cSt, int cEd, int target) {
        while (cSt <= cEd) {
            int mid = cSt + (cEd - cSt) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cSt = mid + 1;
            } else {
                cEd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int row= matrix.length;
        int col= matrix[0].length;
        if(col==0){
            return new int[]{-1, -1};
        }
        if(row==1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }
        int rst= 0;
        int red= row -1;
        int cMid= col/2;

        while (rst<(red-1)){
            int mid= rst+(red-rst)/2;

            if(matrix[mid][cMid]==target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid]>target){
                red= mid;
            }else {
                rst= mid;
            }
        }
        if (matrix[rst][cMid]==target){
            return new int[]{rst, cMid};
        }
        if(matrix[rst+1][cMid]==target){
            return new int[]{rst+1, cMid};
        }
//        search in first line
        if(target<=matrix[rst][cMid-1]){
            return binarySearch(matrix, rst, 0, cMid-1, target);
        }
        if (target>=matrix[rst][cMid+1] && target<= matrix[rst][col-1]){
            return binarySearch(matrix, rst, cMid+1, col-1, target);
        }
//        SEARCH IN SECOND LINE
        if(target<=matrix[rst+1][cMid-1]){
            return binarySearch(matrix, rst+1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rst + 1, cMid + 1, col - 1, target);
        }

    }

}
