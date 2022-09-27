public class pattern8 {
    public static void main(String[] args) {
        pattern();
//        *  *  *  *  *
//           *  *  *  *
//              *  *  *
//                 *  *
//                    *
    }
    static void pattern(){
            int count= 5;
            for (int r = 0; r <= 4; r++) {
                for (int spc = 0; spc <= r; spc++) {
                    System.out.print("   ");
                }
                for (int col = 0; col <count  ; col++) {
                    System.out.print(" * ");
                }
                count--;
                System.out.println();
            }
    }
}
