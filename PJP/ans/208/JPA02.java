import java.util.*;

class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }
  
    public static void test() {
        System.out.println("Input:");
        int i = keyboard.nextInt() / 10;

        switch (i) {
            case 10:
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("Your grade is F");
                break;
        }
    }
}
