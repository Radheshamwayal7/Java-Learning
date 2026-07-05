import java.util.Scanner;

public class Function{
    public static int SumOf2NoFunction(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = SumOf2NoFunction(a,b);
        System.out.println("Sum of 2 No:"+ sum);

        sc.close();
    }
}
