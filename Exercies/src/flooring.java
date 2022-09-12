public class flooring {
    public static void main(String[] args) {
        int [] arr= {6, 7, 10, 13, 16, 18, 23, 24, 26, 29};
        int target= 25;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
//        edge case
        if(target<arr[0]){
            return -1;
        }

        int start= 0;
        int  end= arr.length -1;
        while (start<=end){
            int mid= start+(end -start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else {
                start= mid+1;
            }
        }
        return end;
    }
}
