public class badVersion {
    public static void main(String[] args) {

    }
    static int  firstBadVersion(int n){
        int s=0;
        int e= n;
        while (s<e){
            int m= s+(e-s)/2;
            if(true){
                e= m;
            }else {
                s= m+1;
            }
        }
        return s;
    }
}
