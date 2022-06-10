import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("enter the num: ");
        int num= in.nextInt();

        for (int i = 2; i <= num/2; i++) {
            if(num%i ==0){
                System.out.println(i);
            }
        }
    }
}
