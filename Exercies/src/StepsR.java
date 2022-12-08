public class StepsR {
    public static void main(String[] args) {
        System.out.println(numOfSteps(14));
    }
    static int helper(int num, int steps){
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }

    static int numOfSteps(int num){
        return helper(num, 0);
    }
}
