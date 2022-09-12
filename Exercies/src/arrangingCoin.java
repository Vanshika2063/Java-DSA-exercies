public class arrangingCoin {
    public static void main(String[] args) {
        int n= 8;
        System.out.println(search(n));
    }
    static int search(int n){
        int k= 0;
        while(n>0){
            k++;
            n-=k;
        }
        return n==0 ? k : k-1;
    }
}
