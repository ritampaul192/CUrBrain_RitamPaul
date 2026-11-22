
import java.util.Arrays;

public class Q19 {
    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 2, 3, 4, 5, 6, 7},
            {-1, -100, 3, 99},
            {1, 2},
            {1},
            {1, 2, 3}
        };

        int[] k = {3, 2, 5, 10, 0};

        for (int i = 0; i < tests.length; i++) {
            rotate(tests[i], k[i]);
            System.out.println(Arrays.toString(tests[i]));
        }
    }
}
