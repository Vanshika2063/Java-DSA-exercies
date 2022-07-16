import java.util.Scanner;

public class sumTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter 1st no. : ");
        int num1= in.nextInt();

        System.out.print("enter 2nd no. : ");
        int num2= in.nextInt();

        System.out.println(sumOfTwo(num1, num2));
    }

    static int sumOfTwo(int first, int second) {
        return first+second;
    }
}
