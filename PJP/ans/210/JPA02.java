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
        System.out.println("Input a character");
        String s = keyboard.next();

        if (s.equals("a") || s.equals("b")) {
            System.out.println("You entered a or b");
        }
        else if (s.equals("x")) {
            System.out.println("You entered x");
        }
        else if (s.equals("y")) {
            System.out.println("You entered y");
        }
        else {
            System.out.println("You entered something else");
        }

    }
}


