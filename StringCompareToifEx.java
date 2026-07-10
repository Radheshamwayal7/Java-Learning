import java.util.*;

public class StringCompareToifEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Name1 = sc.nextLine();
        String Name2 = sc.nextLine();

        if(Name1.compareTo(Name2) == 0) {
            System.out.println("The Strings Are Equal");
        }else{
            System.out.println("The Strings Are Not Equal");
        }
        sc.close();
    }
}
