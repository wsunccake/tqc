import java.util.Scanner;
public class JPA01 {
    static double PI = 3.1415926;
    public static void main(String args[]) {
        double totalarea;
        System.out.printf("��έ��n���G%f \n",calCircle(5));
        System.out.printf("�T���έ��n���G%f \n",calTriangle(10, 5));
        System.out.printf("��έ��n���G%f \n",calRectangle(5, 10));
        totalarea = calCircle(5) + calTriangle(10, 5) + calRectangle(5, 10);
        System.out.printf("���ϧέ��n���G%f \n",totalarea);
    }
    static double calCircle(double r) {
        return r * r * PI;
    }
    static double calTriangle(double x, double y) {
        return x * y / 2.0;
    }
    static double calRectangle(double x, double y) {
        return x * y;
    }
}