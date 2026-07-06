import java.util.Scanner;

public class Factorial {
    public static int FindFactorial(int n) {
        int factorial = 1;
        if(n < 0) {
            System.out.println("Invalid Number");
            return n;
        }
        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial Of NO="+factorial);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

            FindFactorial(n);

          sc.close();
    }
}
