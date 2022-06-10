import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("enter Num1: ");
        int Num1= in.nextInt();

        System.out.print("Enter the symbol: ");
        char symbol= in.next().trim().charAt(0);

        System.out.print("enter Num2: ");
        int Num2= in.nextInt();

        int sum=0;
        if(symbol == '+'){
            sum= Num1+Num2;
        }
        else if(symbol == '-'){
            sum=Num1-Num2;
        }
        else if(symbol == '*'){
            sum=Num1*Num2;
        }
        else if(symbol == '/'){
            sum=Num1/Num2;
        }
        else {
            System.out.println("invalid input");
        }
        System.out.println(sum);
    }
}
