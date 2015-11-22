import java.util.Scanner;

public class JPA01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("輸入第1組的x和y座標：");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("輸入第2組的x和y座標：");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        d = Math.sqrt(d);
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。\n", x1, y1, x2, y2, d);

    }

}

