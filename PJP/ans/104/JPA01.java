import java.util.Scanner;

public class JPA01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("��J��1�ժ�x�My�y�СG");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("��J��2�ժ�x�My�y�СG");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        d = Math.sqrt(d);
        System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O%.2f�C\n", x1, y1, x2, y2, d);

    }

}

