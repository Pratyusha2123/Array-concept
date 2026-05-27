import java.util.Scanner;

public class InsertArray {
    static void insertValues(int arr[], int size, Scanner sc) {

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        insertValues(arr, size, sc);

        sc.close();
    }
}
