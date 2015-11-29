import java.util.*;

public class JPA02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    
    static void test() {
        System.out.println("Enter an integer:");
        int i = input.nextInt();
        if (i % 6 == 0)
            System.out.println(i + "琌236计");
        else if (i % 2 == 0)
            System.out.println(i + "琌2计");
        else if (i % 3 == 0)
            System.out.println(i + "琌236计");
        else
            System.out.println(i + "ぃ琌236计");
    }
}
