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
            System.out.println(i + "是2、3、6的倍數");
        else if (i % 2 == 0)
            System.out.println(i + "是2的倍數");
        else if (i % 3 == 0)
            System.out.println(i + "是2、3、6的倍數");
        else
            System.out.println(i + "不是2、3、6的倍數");
    }
}
