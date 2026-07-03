import java.util.Arrays;

public class StringAscending {
    public static void main(String[] args) {

        String[] arr = {"Ram", "Amar", "Cel", "David", "Bunny"};

        Arrays.sort(arr);

        System.out.println("Ascending Order:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

