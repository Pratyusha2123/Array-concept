public class ReverseEachElement {

    public static int reverseNumber(int num) {
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        int[] arr = {23, 55, 57, 93, 1};

        System.out.println("Output:");

        for (int num : arr) {
            System.out.print(reverseNumber(num) + " ");
        }
    }
}
