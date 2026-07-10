import java.util.*;

public class StringFunCompareToEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        System.out.println("Compare:" + name1.compareTo(name2));

        sc.close();
    }
}
