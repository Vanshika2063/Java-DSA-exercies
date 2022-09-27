public class Pattern3 {
    public static void main(String[] args) {
        pattern_2();
//         *
//         *  *
//         *  *  *
//         *  *  *  *
//         *  *  *  *  *
//         *  *  *  *  *  *
//         *  *  *  *  *
//         *  *  *  *
//         *  *  *
//         *  *
//         *
    }
    static void pattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_2(){
        for (int r = 0; r <= 4*2; r++) {
            int tcr= r>4? 2*4-r: r;
            for (int c = 0; c <= tcr; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
