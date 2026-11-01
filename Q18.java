
import java.util.*;

public class Q18 {

    public static void reverseSubSegment(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int start = 1;
        int end = 4;

        reverseSubSegment(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }
}
