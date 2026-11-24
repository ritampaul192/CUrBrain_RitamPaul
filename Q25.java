
public class Q25 {

    public static int[] closestPair(int[] temps, int target) {
        int left = 0;
        int right = temps.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = temps[left] + temps[right];
            int diff = Math.abs(sum - target);

            if (diff < minDiff) {
                minDiff = diff;

                result[0] = temps[left];
                result[1] = temps[right];
            }

            if (sum == target) {
                return result;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temps = {10, 22, 28, 29, 30, 40};
        int target = 54;

        int[] ans = closestPair(temps, target);

        System.out.println("(" + ans[0] + ", " + ans[1] + ")");
    }
}
