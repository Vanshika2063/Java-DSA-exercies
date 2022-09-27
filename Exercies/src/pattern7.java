public class pattern7 {
    public static void main(String[] args) {
            pattern();
//                         *
//                      *  *
//                   *  *  *
//                *  *  *  *
//             *  *  *  *  *
//          *  *  *  *  *  *
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
}
