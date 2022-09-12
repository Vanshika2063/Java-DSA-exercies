import java.lang.reflect.Array;
import java.util.ArrayList;

public class LIS {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,2,3};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
//        10,9,2,5,3,7,101,18
        ArrayList<Integer> subsequence= new ArrayList<Integer>();
        subsequence.add(arr[0]);
        for (int num: arr) {
            if(subsequence.get(subsequence.size() -1 ) < num){
                subsequence.add(num);
            } else{
                int ceil = ceiling(subsequence, num);
                subsequence.set(ceil, num);
            }
        }
        return subsequence.size();
    }

    static int ceiling(ArrayList<Integer> list, int target) {
//        edge case

        int start= 0;
        int end= list.size()-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(target== list.get(mid)){
                return mid;
            }else if(target< list.get(mid)){
                end= mid-1;
            }else {
                start= mid + 1;
            }
        }
        return start;
    }
}
