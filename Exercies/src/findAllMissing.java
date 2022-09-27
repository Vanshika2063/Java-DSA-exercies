import java.util.ArrayList;
import java.util.List;

public class findAllMissing {
    public static void main(String[] args) {
        int[] num= {4,3,2,7,8,2,3,1};
        System.out.println(allMissing(num));
    }
    static List<Integer> allMissing(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        List<Integer> result= new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                result.add(index+1);
            }
        }
        return result;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
