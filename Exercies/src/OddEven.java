public class OddEven {
    public static void main(String[] args) {
        int n= 47;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1)== 1;
    }

    static boolean isEven(int n){

        return (n & 1)== 0;
    }
}
