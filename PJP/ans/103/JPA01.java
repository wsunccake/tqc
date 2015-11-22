import java.util.Scanner;

public class JPA01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.printf("Average: %.2f\n", (a + b + c) / 3.0);
    }     
}
