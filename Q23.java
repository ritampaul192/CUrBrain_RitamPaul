
public class Q23 {

    public static int minSubarraySum(int[] arr) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                minSum = Math.min(minSum, sum);
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, 5};

        System.out.println(minSubarraySum(arr));
    }
}
