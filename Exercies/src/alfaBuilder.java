public class alfaBuilder {
    public static void main(String[] args) {
        int last= 26;
        alfa(last);
    }
    static void alfa(int last){
        StringBuilder a= new StringBuilder();
        for (int i = 0; i < last; i++) {
            char ch= (char) ('a' +i);
            a.append(ch);
        }
        System.out.println(a.toString());
    }
}
