package practice.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String a[] = new String[4];
        String ab = "We were on a break";
        a[3] = "lakhan";
        System.out.println(ab);
        System.out.println(ab.length());
        String b[] = {"my", "name", "is", "lakhan"};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " " + b[i].length());
//            System.out.println(b[i].toCharArray());
            char chararr[] = b[i].toCharArray();
            for (int j = 0; j < chararr.length; j++) {
                System.out.print(chararr[j]);
            }
        }
    }
}

// my 2 m-y