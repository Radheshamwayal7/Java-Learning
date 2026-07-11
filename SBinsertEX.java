import java.util.Scanner;

public class SBinsertEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        System.out.println("Enter The StringBuilder :");
        sb.append(sc.nextLine());
        sb.insert(2, 'O');
        System.out.println("Inserted StringBuilder :" + sb);
        sc.close();
    }
}
