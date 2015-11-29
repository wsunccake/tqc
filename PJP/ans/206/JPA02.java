import java.util.*;

public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
        int chi, eng, math, avg;
        System.out.print("Input Chinese score:");
        chi = keyboard.nextInt();
        System.out.print("Input English score:");
        eng = keyboard.nextInt();
        System.out.print("Input Math score:");
        math = keyboard.nextInt();
        
        String s = "";
        if (chi < 60)
            s += "Chinese failed.\n";

        if (eng < 60)
            s += "English failed.\n";

        if (math < 60)
            s += "Math failed.\n";

        if (s == "")
            s = "All pass.\n";

        System.out.print(s);
    }
}
