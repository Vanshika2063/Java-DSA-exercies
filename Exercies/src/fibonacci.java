import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("enter num for start fibonacci series: ");
        int num= in.nextInt();

        int a= 0;
        int b= 1;
        int count= 2;

//        0  1  1  2  3  5  8
//        a  b

        while (count<=num){
            int temp= b;
            b= b+a;
            a= temp;
            count++;
//            System.out.println(b);
        }
        System.out.println(b);
    }
}
