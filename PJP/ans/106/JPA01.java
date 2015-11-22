public class JPA01 {
    public static void main (String args[]) {
        System.out.printf("f(%f) = %.4f\n", -3.2, f(-3.2));
        System.out.printf("f(%f) = %.4f\n", -2.1, f(-2.1));
        System.out.printf("f(%f) = %.4f\n", 2.1, f(2.1));
    }

    static double f(double x) {
        return 3 * (x * x * x) + 2 * x - 1;
    }
}

