import java.util.Scanner;

public class JPA01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("�п�J�z���m�W�G");
        String name = input.next();

        System.out.printf("Hi, %s,�п�J�z���ɪO���ӼơG\n", name);

        System.out.print("�п�J1�����ƶq�G");
        int coin1 = input.nextInt();

        System.out.print("�п�J5�����ƶq�G");
        int coin5 = input.nextInt();

        System.out.print("�п�J10�����ƶq�G");
        int coin10 = input.nextInt();

        System.out.print("�п�J50�����ƶq�G");
        int coin50 = input.nextInt();

        int total = 50 * coin50 + 10 * coin10 + 5 * coin5 + 1 * coin1;
        int c1 = total % 10;
        int d1 = total / 10;
        int c2 = d1 % 10;
        int d2 = d1 / 10;
        int c3 = d2 % 10;
        int d3 = d2 / 10;
        int c4 = d3 / 10;
        System.out.printf("�z�����`�@���G%d �d  %d ��  %d �Q  %d ��\n", c4, c3, c2, c1);
    }
}