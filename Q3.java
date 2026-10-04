public class Q3 {

    static int palindromeOrSum(int n) {

        int original = n;

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

        if (original >= 0 && original == reversed) {
            return original;
        }

        return original + reversed;
    }

    public static void main(String[] args) {

        System.out.println(palindromeOrSum(121));
        System.out.println(palindromeOrSum(123));
        System.out.println(palindromeOrSum(0));
        System.out.println(palindromeOrSum(-45));
        System.out.println(palindromeOrSum(120));
    }
}