import java.util.Scanner;

public class ArirhmeticOpMulUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int Mul = a * b;
        System.out.println("Multiplication Of Two Number Is :" + Mul);
        sc.close();
    }
}
