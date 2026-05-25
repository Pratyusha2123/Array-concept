import java.util.Scanner;

public class EvenIndexValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.println("Enter 6 array elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even index values are:");

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}