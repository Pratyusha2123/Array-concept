import java.util.Arrays;

public class CharacterAscending {
    public static void main(String[] args) {

        char[] arr = {'R', 'A', 'C', 'D', 'B'};

        Arrays.sort(arr);

        System.out.println("Ascending Order:");
        for (char ch : arr) {
            System.out.println(ch);
        }
    }
}
