import java.util.*;

public class SBappendEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("How many characters do you want to enter?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter Character :" + (i+1) + ":" );
            sb.append(sc.next());
            System.out.println("StringBuilder So Far :" + sb);
        }
        System.out.println("Final Result :" + sb);
        sc.close();
    }
}
