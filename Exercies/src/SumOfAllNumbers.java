import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int sum=0;
        int num;
        while (true) {
            System.out.print("enter the num: ");
            num = in.nextInt();
            if(num == 0){
                break;
            } sum += num;
        }
        System.out.println(sum);
    }
}
