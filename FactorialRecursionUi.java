import java.util.Scanner;

public class FactorialRecursionUi {
    public static double calcFactorial(double n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        double fact_nm1 = calcFactorial(n-1);
        double fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        double n = sc.nextInt();
        double ans = calcFactorial(n);
        System.out.println("Factorial is :" + ans);
        sc.close();
    }
}
