import java.util.Scanner;

public class minMaxThreeFunc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter 1st no. : ");
        int num1= in.nextInt();

        System.out.print("Enter 2st no. : ");
        int num2= in.nextInt();

        System.out.print("Enter 3st no. : ");
        int num3= in.nextInt();
        Maximum(num1, num2, num3);

    }
    static void Maximum(int a, int b, int c){
//        a= 5;       b= 2;       c= 3;
        if(a > b){
            if(a > c){
                System.out.println(a);
            }
            else {
//        a= 3;       b= 2;       c= 5;
                System.out.println(c);
            }
        }

//        a= 2;       b= 5;       c= 3;
        else if (b > a){
            if(b > c){
                System.out.println(b);
            }
//        a= 2;       b= 3;       c= 5
            else {
                System.out.println(c);
            }
        }
    }
}
