import java.util.Scanner;

interface Animal6 {
    void walk();

}

class Animals6 implements Animal6 {
    String name;
    public void walk(){
        System.out.println("Animal Can walk" );

    }
}

public class InterfaceUi {
    public static void main(String[] args) {
        Animals6 h6 = new Animals6();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Animal Name :");
        h6.name = sc.nextLine();
        h6.walk();
        sc.close();

        
    }

}
