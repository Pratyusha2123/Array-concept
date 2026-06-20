public class RemoveElementsBeforeIndex {
    public static void removeBeforeIndex(int[] arr, int index) {
        System.out.print("{");

        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("}");
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 1, 3, 2};
        removeBeforeIndex(arr, 3);
        removeBeforeIndex(arr, 5);
    }
}