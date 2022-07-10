public class Naturalno {
    public static void main(String[] args) {
        System.out.println(naturalN(5));
    }
    static int naturalN(int n){
        int sum= 0;
        for (int i = 0; i <= n ; i++) {
            sum+= i;
        }
        return  sum;
    }
}
