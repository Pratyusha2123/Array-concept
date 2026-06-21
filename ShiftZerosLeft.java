public class ShiftZerosLeft {

    public static void shiftZerosLeft(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 5, 3, 1, 0, 3, 1};

        shiftZerosLeft(arr);

        System.out.print("Output: ");

        for (int num : arr) {
            System.out.print(num);
        }
    }
}
