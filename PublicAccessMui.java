import java.util.Scanner;

class PublicUi {
    String name;

    public void Print() {
        System.out.println("The String Is :"+this.name);
    }

}

public class PublicAccessMui {
    public static void main(String[] args) {
        PublicUi Pu = new PublicUi();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String :");
        Pu.name = sc.nextLine();
        Pu.Print();
        sc.close();
    }
}
