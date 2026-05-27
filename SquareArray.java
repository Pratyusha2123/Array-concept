public class SquareArray {
    static void printSquares(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        printSquares(arr);
    }
}
