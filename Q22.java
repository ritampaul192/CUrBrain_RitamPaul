
import java.util.Arrays;

public class Q22 {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[][] nums1Tests = {
            {1, 2, 3, 0, 0, 0},
            {0},
            {1},
            {4, 5, 6, 0, 0, 0},
            {1, 3, 5, 0, 0}
        };

        int[][] nums2Tests = {
            {2, 5, 6},
            {1},
            {},
            {1, 2, 3},
            {2, 4}
        };

        int[] m = {3, 0, 1, 3, 3};
        int[] n = {3, 1, 0, 3, 2};

        for (int i = 0; i < nums1Tests.length; i++) {
            merge(nums1Tests[i], m[i], nums2Tests[i], n[i]);
            System.out.println(Arrays.toString(nums1Tests[i]));
        }
    }
}
