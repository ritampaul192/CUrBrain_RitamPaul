public class Q2 {

    static int reverseAndDouble(int n) {

        int sign = 1;

        if (n < 0) {
            sign = -1;
            n = -n;
        }

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        reversed = reversed * sign;

        return reversed * 2;
    }

    public static void main(String[] args) {

        System.out.println(reverseAndDouble(123));
        System.out.println(reverseAndDouble(-45));
        System.out.println(reverseAndDouble(0));
        System.out.println(reverseAndDouble(1200));
        System.out.println(reverseAndDouble(9));
    }
}