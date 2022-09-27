public class Pattern2 {
    public static void main(String[] args) {
        pattern_3();
//        *  *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *

    }
    static void pattern(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_3(){
        for (int r = 0; r <= 4; r++) {
            for (int c = 0; c <= 4-r; c++) {
                System.out.print(c+1+ " ");
            }
            System.out.println();
        }
    }

    static void pattern_2() {
        int count= 5;
        for (int row = 1; row <= 5; row++) {
            // for every row, run the col
            for (int col = 1; col <= count; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            count--;
            System.out.println();
        }
    }

}
