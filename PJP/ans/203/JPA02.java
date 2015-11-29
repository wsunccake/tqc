import java.util.*;

public class JPA02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    static void test() {
        System.out.println("Input an integer:");
        int i = input.nextInt();
        if (i % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}
