import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceTwoArr {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2= {2,4,6};
        System.out.println(findDifference(arr1, arr2));
    }

    static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {

        List<List<Integer>> arr = new ArrayList<>();

        Set<Integer> list1= new HashSet<>();
        for (int n: arr1) {
            list1.add(n);
        }

        Set<Integer> list2= new HashSet<>();
        for (int n: arr2) {
            list2.add(n);
        }

        List<Integer> unique1= new ArrayList<>();
        List<Integer> unique2= new ArrayList<>();

        for (int n: list1) {
            if (list2.contains(n)){
                list2.remove(n);
            }else {
                unique1.add(n);
            }
        }

        for (int n: list2) {
            unique2.add(n);
        }

        arr.add(unique1);
        arr.add(unique2);

        return arr;
    }
}
