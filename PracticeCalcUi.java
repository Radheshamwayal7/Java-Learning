import java.util.Scanner;

public class PracticeCalcUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number :");
        Double a = sc.nextDouble();
        System.out.println("Enter The Second Number :");
        double b = sc.nextDouble();

        System.out.println("Multiplication :" + (a * b));
        System.out.println("Addition :" + (a + b));
        System.out.println("Subtraction :" + (a - b));
        System.out.println("Division :" + a / b);
        System.out.println("Modulo :" + (b%a));
        System.out.println("Modulo :" + (a%b));

        sc.close();
    }
}

