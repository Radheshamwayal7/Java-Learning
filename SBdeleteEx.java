import java.util.*;

public class SBdeleteEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("String Builder :");
        sb.append(sc.nextLine());
        sb.delete(7, 8);
        System.out.println("Deleted StringBuilder :" + sb);
        sc.close();
    }
}
