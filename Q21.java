
import java.util.Arrays;

public class Q21 {
    static int delete(int[] arr, int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr.length;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return arr.length - 1;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {10, 20, 30, 20, 40},
            {5, 15},
            {7},
            {},
            {4, 4, 4}
        };

        int[] targets = {20, 99, 7, 3, 4};

        for (int i = 0; i < tests.length; i++) {
            int len = delete(tests[i], targets[i]);

            System.out.println(Arrays.toString(
                Arrays.copyOf(tests[i], len)
            ));
        }
    }
}
