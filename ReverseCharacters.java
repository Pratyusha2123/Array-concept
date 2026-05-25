import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters: ");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        System.out.println("Characters in reverse order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}