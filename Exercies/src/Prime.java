public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int count= 2;
        while (count * count <= n){
            if(n % count == 0){
                return false;
            }
        }
        return count * count > n;
    }
}
