import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int sum = 0;

        System.out.println("Enter 6 array elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}
