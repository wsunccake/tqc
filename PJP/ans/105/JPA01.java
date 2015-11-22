import java.util.Scanner;

public class JPA01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入您的姓名：");
        String name = input.next();

        System.out.printf("Hi, %s,請輸入您的銅板的個數：\n", name);

        System.out.print("請輸入1元的數量：");
        int coin1 = input.nextInt();

        System.out.print("請輸入5元的數量：");
        int coin5 = input.nextInt();

        System.out.print("請輸入10元的數量：");
        int coin10 = input.nextInt();

        System.out.print("請輸入50元的數量：");
        int coin50 = input.nextInt();

        int total = 50 * coin50 + 10 * coin10 + 5 * coin5 + 1 * coin1;
        int c1 = total % 10;
        int d1 = total / 10;
        int c2 = d1 % 10;
        int d2 = d1 / 10;
        int c3 = d2 % 10;
        int d3 = d2 / 10;
        int c4 = d3 / 10;
        System.out.printf("您的錢總共有：%d 千  %d 百  %d 十  %d 元\n", c4, c3, c2, c1);
    }
}