public class smallestLetter {
    public static void main(String[] args) {
        char[] arr= {'c', 'f', 'j'};
        char target= 'j';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start= 0;
        int end= letters.length -1;
        if (target>letters[letters.length -1]){
            return letters[0];
        }
        while (start<=end){
            int mid= start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else {
                start= mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
