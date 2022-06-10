import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("enter your name for greeting: ");
        String Name= in.nextLine();

        System.out.println("hey " +Name);
    }
}
