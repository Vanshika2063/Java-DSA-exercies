public class palindromeR {
    public static void main(String[] args) {
        System.out.println(palindrome(212));
    }
    static int helper(int n, int digits){
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static boolean palindrome(int n) {
        return n == rev(n);
    }
}
