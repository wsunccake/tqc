import java.util.*;

class JPA02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
  
    public static void test() {
        System.out.println("Input:");
        int i = input.nextInt();
        if (i % 45 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

