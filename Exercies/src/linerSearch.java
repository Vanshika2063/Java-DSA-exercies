public class linerSearch {
    public static void main(String[] args) {
        int[] arr= {34, 56, 8, 2, 71, 7, 10, 5, 1, 66};
        int target= 56;
//        System.out.println(LinerSearch(arr, target));
//        System.out.println(searchRange(arr, 2, 6, 71));
        System.out.println(countEven(arr));
    }

    static int countEven(int[] arr) {
        int count= 0;
        for (int a:arr) {
            if(a%2==0){
                count++;
            }
        }
        return count;
    }

    static boolean LinerSearch(int[] arr, int target) {
        for (int a: arr) {
            if(a==target){
                return true;
            }
        }
        return false;
    }

    static int searchRange(int[] arr, int start, int end, int target){
        for (int i = start; i < end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
