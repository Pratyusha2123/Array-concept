public class SecondSmallest {
    static int findSecondSmallest(int arr[]) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2, 4};

        System.out.println(findSecondSmallest(arr));
    }
}
