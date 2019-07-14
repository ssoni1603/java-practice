package practice.Strings;

public class StringStartsandEndsWithFunction {
    public static void main(String[] args) {
        String s = "abcdefkj";
        if (s.startsWith("ab")) {
            System.out.println("Yes");
        }
        else if (s.endsWith("kaj")) {
            System.out.println("No");
        }
        else
        System.out.println("no matching string");
    }
}
