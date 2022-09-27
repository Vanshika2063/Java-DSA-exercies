import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ex {
//  STRING IS NON-PRIMITIVE DATA TYPE.
    public static void main(String[] args) {

        String a= new String("vanshika");
        String b= new String("vanshika");
        System.out.println(a==b);

        String a1= "hey i'm vanshika sharma";
        String b1= "sharma";
        System.out.println(a1);
        System.out.println(a1==b1);

        System.out.println(a.equals(b));
        System.out.println(a1.charAt(4));

//        wrapper class: a class whose object wraps or contains primitive data types.
        Integer c= new Integer(54812);
        System.out.println(c);

        float c1= 55.5954845F;
        System.out.println("here some some no." +c1);

//       why we write 4 before f. we only want 4 val after "."
//       printf use for formatting the txt.
        System.out.printf("some other no. %.4f", c1);

        System.out.printf("hey there i'm %s & learning %s", "vanshika", "java(dsa)");

//        when you write any character in this ' ' single quotes they pick there sky values(ASCII  (American Standard Code for Information Interchange) )
//        a=97;     b=98;
        System.out.println('a' + 'b');

//        if you write like this " " in double quotes they concat the strings.
        System.out.println("a" + "b");

//        a is already here so the 3 is the fourth character of alfa (means d).
//        d= 100;
        System.out.println('a' + 3);

//        typecasting: 3 change into d.
        System.out.println((char) ('a' + 3));

//        they concat 1 with a.
//        here they concat because of wrapper class. they actually call to
        System.out.println("a" + 1);

//        whenever we use a complex expression at least one typescript object ("" , '', etc) use. otherwise we get error
//        System.out.println(new Integer(56) + new ArrayList<>()); i didn't use any typescript object here
        System.out.println(new Integer(56) + ""  + new ArrayList<>());

        System.out.println(Arrays.toString(a1.toCharArray()));
        System.out.println(a1.toUpperCase());
        System.out.println();
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(a1.matches("vanshika"));
        System.out.println(a1.trim());

//        STRIP.....
        System.out.println(Arrays.toString(a1.toCharArray()));
    }
}
