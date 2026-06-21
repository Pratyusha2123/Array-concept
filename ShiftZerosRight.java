public class ShiftZerosRight {

    public static void shiftZeros(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};

        shiftZeros(arr);

        System.out.print("Output: ");

        for (int num : arr) {
            System.out.print(num);
        }
    }
}
