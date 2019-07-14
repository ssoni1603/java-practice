package practice.Strings;

public class StringTrimFunction {
    public static void main(String Args[]){
        String s = "      abcd";
        String q = "   ab  ch   ";
        System.out.println("Length of " + s + " is: " + s.length());
        System.out.println("Length of " + q + " is: " + q.length());
        s = s.trim();
        q = q.trim();
        System.out.println("Now length of " + s + " is: " + s.length());
        System.out.println("Now length of " + q + " is: " + q.length());
    }
}
