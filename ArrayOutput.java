public class ArrayOutput {
    static void printNumbers(int arr[]) {

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != 4) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        printNumbers(arr);
    }
}
