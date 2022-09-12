public class shipPackagesDDays {
    public static void main(String[] args) {
        int[] arr= {1,2,3,1,1};
        int days= 4;
        System.out.println(shipWithinDays(arr, days));
    }
    static int shipWithinDays(int[] weights, int days){
        int start= 0;
        int end= 0;
        for (int i = 0; i < weights.length; i++) {
            start= Math.max(start, weights[i]);
            end+= weights[i];
        }

        while (start<end){
            int mid= start+(end-start)/2;

            int sum= 0;
            int d=1;
            for (int num: weights) {
                if (sum+num>mid){
                    sum= num;
                    d++;
                }else {
                    sum+= num;
                }
            }

            if (d>days){
                start= mid+1;
            }else {
                end= mid;
            }
        }
        return end;
    }
}
