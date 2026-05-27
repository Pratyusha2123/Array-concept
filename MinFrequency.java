public class MinFrequency {
  static void findMinFrequency(int arr[]) {

        boolean visited[] = new boolean[arr.length];

        int minCount = arr.length;
        int minElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count < minCount) {
                minCount = count;
                minElement = arr[i];
            }
        }

        System.out.println(minElement + " - " + minCount);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 1, 4};

        findMinFrequency(arr);
    }  
}
