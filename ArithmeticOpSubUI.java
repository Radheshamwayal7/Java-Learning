import java.util.Scanner;

public class ArithmeticOpSubUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sub = a - b;
        System.out.println("Subtraction of Two Number is :" + sub);
        sc.close();
    }
}
