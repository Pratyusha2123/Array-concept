public class LastIndex {
    static int findLastIndex(int arr[], int key) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 19, 3, 9, 4, 9, 6, 7, 8};

        int result = findLastIndex(arr, 9);

        System.out.println(result);
    }
}
