public class MergeArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[index++] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};

        int[] merged = mergeArrays(input1, input2);

        System.out.print("Output: [");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);

            if (i < merged.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }
}
