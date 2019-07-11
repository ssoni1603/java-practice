package practice.Arrays;

public class TwoDArray {

    public static void main(String[] args) throws InterruptedException {
        int b[][] = new int[10][5];

        int a[][] = new int[][]{
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        for (int i = 0; i < a.length; i++) { // i=0 i=1
            System.out.println("a[i].length) " + a[i].length);
            for (int j = 0; j < a[i].length; j++) { //j=0 j=1 j=2
                System.out.println(a[i][j]); //1 2
            }
        }

        System.out.println();

        Thread.sleep(10);

        int customInitializationOfArray[][] = new int[3][];
        customInitializationOfArray[0] = new int[5];
        customInitializationOfArray[1] = new int[3];
        customInitializationOfArray[2] = new int[4];
//         customInitializationOfArray[3] = new int[2];    => compile time error... why ??

        System.out.println(customInitializationOfArray);
    }
}
