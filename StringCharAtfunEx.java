import java.util.Scanner;

public class StringCharAtfunEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for(int i = 0; i < name.length(); i++) {
            System.out.println("CharAt:" + name.charAt(i));
        }
        sc.close();
    }
}
