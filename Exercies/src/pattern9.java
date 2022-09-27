public class pattern9 {
    public static void main(String[] args) {
        pattern();
        pattern_2();

//                        *
//                     *  *
//                  *  *  *
//               *  *  *  *
//            *  *  *  *  *
//         *  *  *  *  *  *
//            *  *  *  *  *
//               *  *  *  *
//                  *  *  *
//                     *  *
//                        *
    }
    static void pattern(){
        int count= 5;
        for (int r = 0; r <= 5 ; r++) {

            for (int spc = 0; spc < count; spc++) {
                System.out.print("   ");
            }
            for (int c = 0; c <= r ; c++) {
                System.out.print(" * ");
            }
            count--;
            System.out.println();
        }
    }

    static void pattern_2(){
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
