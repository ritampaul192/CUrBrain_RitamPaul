public class Q1 {

    static boolean hasEvenDigits(int n) {

        n = Math.abs(n);

        if (n == 0) {
            return false;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(hasEvenDigits(1234));
        System.out.println(hasEvenDigits(12345));
        System.out.println(hasEvenDigits(0));
        System.out.println(hasEvenDigits(-100000));
        System.out.println(hasEvenDigits(-7));
    }
}