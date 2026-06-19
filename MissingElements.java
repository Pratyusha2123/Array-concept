public class MissingElements {

    public static void findMissing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 13};
        findMissing(arr);
    }
}
