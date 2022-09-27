public class pattern4 {
    public static void main(String[] args) {
        pattern();
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *
//          * * * *
//           * * *
//            * *
//             *
    }
    static void pattern(){
        for (int row = 0; row <= 2 * 4 /* 8 */; row++) {
            int tcr = row > 4 ? 2 * 4 - row: row;

            int spc = 4 - tcr;
            for (int s = 0; s < spc; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= tcr; col++) {
                System.out.print(" " +row);
            }
            System.out.println();
        }
    }
}
