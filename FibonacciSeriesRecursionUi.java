import java.util.Scanner;

public class FibonacciSeriesRecursionUi {
    public static void fiboPrint(int a , int b , int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fiboPrint(b, c , n - 1);
    }
    public static void main(String[] args) {
        int a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series Is :");
        fiboPrint(a, b, n-2);
        sc.close();
    }
}

