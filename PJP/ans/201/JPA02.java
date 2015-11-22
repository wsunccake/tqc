import java.util.Scanner;

public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
        System.out.println("Please enter score:");
        int score = new Scanner(System.in).nextInt();
        if (score >= 60)
            System.out.println("You pass");
        System.out.println("End");
    }
}
