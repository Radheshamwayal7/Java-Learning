import java.util.*;

public class StringLengthEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        System.out.println("Length Of Name1:" + name1.length());
        System.out.println("Length of Name2:" + name2.length());

        sc.close();
    }
}
