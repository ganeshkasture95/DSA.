package SimpleDSA.Recursion;

public class powerSquaring {

    public static void main(String[] args) {
        System.out.println(power(2, 20));
    }

    public static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
