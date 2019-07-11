package practice.Arrays;


// print sum of the given 2 matrices
// both matrices are of 2*3
// expected output as below:

/**
 * 8 10 12
 * 14 16 18
 */
public class SumOf2Matrices {

    public static void main(String[] args) {
        int a[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6}};
        int b[][] = new int[][]{
                {7, 8, 9},
                {10, 11, 12}};


        for (int i = 0; i < a.length; i++) {//0.3
            for (int j = 0; j < a[i].length; j++) { //0.3
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }

}
