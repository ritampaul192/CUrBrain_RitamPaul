import java.util.ArrayList;
import java.util.Collections;

public class Q5 {

    static ArrayList<Integer> replaceEvenDigits(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                result.add(0);
            } else {
                result.add(digit);
            }

            n = n / 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        System.out.println(replaceEvenDigits(258));
        System.out.println(replaceEvenDigits(12345));
        System.out.println(replaceEvenDigits(2468));
        System.out.println(replaceEvenDigits(13579));
        System.out.println(replaceEvenDigits(1002));
    }
}