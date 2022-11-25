public class Prime {
    public static void main(String[] args) {

//        System.out.println(isPrime(7));
        for (int i = 2; i <= 20; i++) {
            System.out.println(i+ " " +(isPrime(i)));
        }
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
            count ++;
        }
        return true;
    }
}
