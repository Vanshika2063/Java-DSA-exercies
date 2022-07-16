import java.util.Scanner;

public class eligibleVote {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.print("enter the voter age: ");
        int voterAge= in.nextInt();
        System.out.println(eligibleForVote(voterAge));
    }
    static boolean eligibleForVote(int age){
        if(age == 18 || age >18){
            return true;
        }
        return false;
    }
}
