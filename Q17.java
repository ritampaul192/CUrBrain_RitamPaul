import java.util.*;

public class Q17 {

    public static int mostPopularItem(int[] sales) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int id : sales) {
            freq.put(id, freq.getOrDefault(id, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int id = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq ||
                (count == maxFreq && id < ans)) {
                maxFreq = count;
                ans = id;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] sales = {101, 103, 101, 102, 103, 105, 101, 103};

        System.out.println(mostPopularItem(sales));
    }
}
