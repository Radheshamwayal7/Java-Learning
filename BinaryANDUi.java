import java.util.Scanner;

public class BinaryANDUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Decimal No:");
        int a = sc.nextInt();

        System.out.println("Enter The Second Decimal Number:");
        int b = sc.nextInt();

        System.out.println("The AND Operation IS :");
        System.out.println( a & b);
        sc.close();

    }
}
