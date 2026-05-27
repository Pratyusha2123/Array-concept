public class MaxFrequency {
     static void findMaxFrequency(int arr[]) {

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println(maxElement + " - " + maxCount);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 1, 4};

        findMaxFrequency(arr);
    }
}
