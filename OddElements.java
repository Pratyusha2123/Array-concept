import java.util.Scanner;

public class OddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.println("Enter 6 array elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Odd elements in the array are:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
