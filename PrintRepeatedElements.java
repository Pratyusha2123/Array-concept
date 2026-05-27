public class PrintRepeatedElements {

    public static void printRepeated(int[] arr) {

        System.out.print("Output: ");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;

            // Check if already printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2};

        printRepeated(arr);
    }
}
