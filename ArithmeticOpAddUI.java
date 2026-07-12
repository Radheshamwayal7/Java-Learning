import java.util.*;

public class ArithmeticOpAddUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Addition Of Two Numbers Is :" + sum );
        sc.close();
    }
}
