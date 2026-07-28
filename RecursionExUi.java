import java.util.Scanner;

public class RecursionExUi {
    public static void printNumb(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();
        printNumb(n);

        sc.close();
    }
}
