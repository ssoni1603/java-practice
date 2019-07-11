package practice.Arrays;

public class Arrays {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,1,1,1};
        int num[] = {1, 2, 3, 5};
        arr[0] = 1;
        arr[4] = 10;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count = count + num[i];
        }
        System.out.println(count);

        num = new int[100];
        System.out.println(num.length);
    }
}

