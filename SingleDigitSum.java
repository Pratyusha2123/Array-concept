public class SingleDigitSum {
    static int singleDigit(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    static void printSingleDigit(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(singleDigit(arr[i]) + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {23, 55, 57, 93, 10, 1};

        printSingleDigit(arr);
    }
}
