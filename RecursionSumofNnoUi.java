import java.util.Scanner;

public class RecursionSumofNnoUi {
    public static void printSum(int i,int n,int sum) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Number :");
        int i = sc.nextInt();
        System.out.println("Enter Last Number :");
        int n= sc.nextInt();
        printSum(i, n, 0);
        sc.close();
    }
}
