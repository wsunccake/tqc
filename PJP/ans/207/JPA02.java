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
        System.out.print("�п�J�T�Ӿ�ơG");
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
            System.out.println("���i�H�c���T����");
        else if (l1 * l1 == l2 * l2 + l3 * l3)
            System.out.println("�����T����");
        else if (l1 * l1 > l2 * l2 + l3 * l3)
            System.out.println("�w���T����");
        else
            System.out.println("�U���T����");
    }
}
