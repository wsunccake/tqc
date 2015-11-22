import java.util.Scanner;
public class JPA01 {
    public static void main (String args[]) {
        System.out.print("Please input: ");
        double weight = new Scanner(System.in).nextDouble();
        System.out.format("%9.6f kg = %9.6f ponds\n", weight, weight * 2.20462);
    }
}