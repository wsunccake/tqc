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
        System.out.println("請輸入x座標：");
        double x = keyboard.nextDouble();
        System.out.println("請輸入y座標：");
        double y = keyboard.nextDouble();

        String s = "";
        if (x == 0.0 && y == 0.0)
            s = "(%.2f,%.2f)為原點\n";
        else if (x > 0.0 && y > 0.0)
            s = "(%.2f,%.2f)在第一象限\n";
        else if (y == 0.0)
            s = "(%.2f,%.2f)在x軸上\n";
        else if (x > 0.0 && y < 0.0)
            s = "(%.2f,%.2f)在第四象限\n";
        else if (x == 0.0)
            s = "(%.2f,%.2f)在y軸上\n";
        else if (x < 0.0 && y > 0.0)
            s = "(%.2f,%.2f)在第二象限\n";
        else
            s = "(%.2f,%.2f)在第三象限\n";

        System.out.printf(s, x, y);
    }
}
