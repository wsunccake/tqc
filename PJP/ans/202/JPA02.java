import java.util.*;
class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input:");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > y)
            System.out.printf("%d is larger than %d\n", x, y);
        else
            System.out.printf("%d is larger than %d\n", y, x);
    }
}
