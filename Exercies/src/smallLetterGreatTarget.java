public class smallLetterGreatTarget {
    public static void main(String[] args) {
        char[] letter= {'c', 'f', 'j'};
        char target= 'd';
        System.out.println(nextGreatestLetter(letter, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s= 0;
        int e= letters.length-1;
        while (s<e){
            int m= s+(e-s)/2;
            if (letters[m]<=target){
                s= m+1;
            }else {
                e= m;
            }
        }
        return letters[s % letters.length];
    }
}
