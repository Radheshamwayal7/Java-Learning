import java.util.Scanner;

public class ArithmeticOpDivUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int div = a / b;
        System.out.println("Division Of Two Number is :" + div);
        sc.close();
    }
}
