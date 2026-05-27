public class SumOfEvenDigits {

    // Method to find sum of even digits
    public static int sumEvenDigits(int num) {

        int sum = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            num = num / 10;
        }

        // Return original number if no even digit exists
        return (sum == 0) ? original : sum;
    }

    public static void main(String[] args) {

        int[] arr = {231, 554, 572, 962, 24, 1};

        System.out.println("Output:");

        for (int num : arr) {
            System.out.print(sumEvenDigits(num) + " ");
        }
    }
}
