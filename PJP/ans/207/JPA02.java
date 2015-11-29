import java.util.*;

public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
        System.out.print("請輸入三個整數：");
        int l1 = keyboard.nextInt();
        int l2 = keyboard.nextInt();
        int l3 = keyboard.nextInt();

        int tmp = l1;
        if (l1 < l2) {
            tmp = l1;
            l1 = l2;
            l2 = tmp;
        }

        if (l1 < l3) {
            tmp = l1;
            l1 = l3;
            l3 = tmp;
        }

        if (!(l3 > 0 && l2 > 0 && l1 > 0 && l1 < l2 + l3))
            System.out.println("不可以構成三角形");
        else if (l1 * l1 == l2 * l2 + l3 * l3)
            System.out.println("直角三角形");
        else if (l1 * l1 > l2 * l2 + l3 * l3)
            System.out.println("鈍角三角形");
        else
            System.out.println("銳角三角形");
    }
}
