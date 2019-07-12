package practice.Strings;

public class StringPractice {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = s;
        String s3 = "abc";
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.hashCode());

        String s4 = new String("abc");
        System.gc();

        System.out.println(s4.hashCode());
        s = s + "d";
        System.out.println(s.hashCode());
        System.out.println(s.length());
    }
}
