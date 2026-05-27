public class AddTwoArrays {

    public static int[] addArrays(int[] arr1, int[] arr2) {

        int max = Math.max(arr1.length, arr2.length);
        int[] result = new int[max];

        for (int i = 0; i < max; i++) {

            if (i < arr1.length && i < arr2.length) {
                result[i] = arr1[i] + arr2[i];
            } else if (i < arr1.length) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i];
            }
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] input1 = {2, 3, 4, 1};
        int[] input2 = {2, 3, 5, 6, 7, 8, 9};

        System.out.println("Test Case 1 Output:");
        printArray(addArrays(input1, input2));

        // Test Case 2
        int[] input3 = {2, 3, 5, 6, 7, 8, 9};
        int[] input4 = {2, 3, 4, 1};

        System.out.println("Test Case 2 Output:");
        printArray(addArrays(input3, input4));
    }
}
