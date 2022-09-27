import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection2ArrII {
    public static void main(String[] args) {

    }
    static int[] intersect(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i= 0;
        int j= 0;

        List<Integer> inter= new ArrayList<Integer>();
        while (true){
            if (i>= arr1.length || j>= arr2.length){
                break;
            }
            if(arr1[i]==arr2[j]){
                inter.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]) {
                j++;
            }
        }

        int[] res= new int[inter.size()];
        int index= 0;
        for (int num: inter) {
            res[i]= num;
            index++;
        }
        return res;
    }
}
