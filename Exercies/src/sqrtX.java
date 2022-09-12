public class sqrtX {
    public static void main(String[] args) {
        int x= 5;
        System.out.println(search(x));
    }
    static int search(int n){
        int s= 1;
        int e= n;
        while(s<e){

            int m= s+(e-s)/2;
            if(m*m<n){
                s= m+1;
            }else {
                e= m;
            }
        }
        return s>1? s-1: 1;
    }
}
