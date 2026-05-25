import java.util.Scanner;

public class SecondLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.println("Enter 6 array elements:");

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second last element = " + arr[arr.length - 2]);

        sc.close();
    }
}
