import java.util.Scanner;

public class SumEvenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter 6 array elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of even index values = " + evenSum);
        System.out.println("Sum of odd index values = " + oddSum);

        sc.close();
    }
}
