import java.util.*;

class JPA03 {
    public static void main(String argv[]) {
        System.out.println("Input:");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i + sum;                       
        }
        System.out.println(1 + " + ... + " + n + " = " + sum);
    }
}