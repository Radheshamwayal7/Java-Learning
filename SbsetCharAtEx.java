import java.util.*;

public class SbsetCharAtEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine());
        sb.setCharAt(2, 'o');
        System.out.println("StringBuilder :" + sb);
        sc.close();
    }
}
