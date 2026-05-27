public class VowelArray {
    static void printVowels(char arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'A' || arr[i] == 'E' ||
                arr[i] == 'I' || arr[i] == 'O' ||
                arr[i] == 'U') {

                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        char arr[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        printVowels(arr);
    }
}
