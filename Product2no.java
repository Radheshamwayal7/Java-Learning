import java.util.Scanner;

public class Product2no {
    public static int Productreturn(int a , int b) {
        int product = a * b;
        return product;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = Productreturn(a, b);
        System.out.println("2 No of Product is="+ product);

        sc.close();
    }
}
