import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        
        int[] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Copy of an Array: " + Arrays.toString(targetArray));
    }
}
