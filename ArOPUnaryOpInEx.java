import java.util.Scanner;

public class ArOPUnaryOpInEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        b = a++;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}