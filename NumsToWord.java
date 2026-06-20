public class NumsToWord {

    private static final String[] LESS_THAN_20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = {
        "", "Thousand", "Million"
    };

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String words = "";
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        int[] testNumbers = {0, 14, 85, 123, 405, 12345, 987654321};

        System.out.println("--- Number to Words Conversion ---");
        for (int num : testNumbers) {
            System.out.println(num + " -> \"" + convertToWords(num) + "\"");
        }
    }
}
