public class subtractProductAndSum {
    public static void main(String[] args) {
        int num= 234;
        System.out.println(subtractProductAndSum(num));
    }
    static int subtractProductAndSum(int n) {
        int product= 1;
        int sum= 0;
        while(n>0){
            product *= n %10;
            sum += n % 10;
            n /= 10;
        }
        return product-sum;
    }
}
