import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter no.: ");
        int Num= in.nextInt();

        if(Num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
