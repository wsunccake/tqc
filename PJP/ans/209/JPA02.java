import java.util.*;

public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    public static void test() {
        System.out.println("�п�Jx�y�СG");
        double x = keyboard.nextDouble();
        System.out.println("�п�Jy�y�СG");
        double y = keyboard.nextDouble();

        String s = "";
        if (x == 0.0 && y == 0.0)
            s = "(%.2f,%.2f)�����I\n";
        else if (x > 0.0 && y > 0.0)
            s = "(%.2f,%.2f)�b�Ĥ@�H��\n";
        else if (y == 0.0)
            s = "(%.2f,%.2f)�bx�b�W\n";
        else if (x > 0.0 && y < 0.0)
            s = "(%.2f,%.2f)�b�ĥ|�H��\n";
        else if (x == 0.0)
            s = "(%.2f,%.2f)�by�b�W\n";
        else if (x < 0.0 && y > 0.0)
            s = "(%.2f,%.2f)�b�ĤG�H��\n";
        else
            s = "(%.2f,%.2f)�b�ĤT�H��\n";

        System.out.printf(s, x, y);
    }
}
