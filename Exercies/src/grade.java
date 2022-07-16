import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your marks: ");
        int marks = in.nextInt();
        System.out.println(givenGrade(marks));
    }

    static String givenGrade(int grade) {
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
        if (grade >= 91) {
            return "AA";
        } else if (grade >= 81) {
            return "AB";
        } else if (grade >= 71) {
            return "BB";
        } else if (grade >=61){
            return "BC";
        } else if(grade>=51){
            return "CD";
        } else if(grade>=41){
            return "DD";
        }
        return "Sorry! try next time";
    }
}
