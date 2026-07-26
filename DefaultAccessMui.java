import java.util.*;

class Defaultui{
    String name;

    void Print() {
        System.out.println("The String Is :" + this.name);
    }
}

class DefaultAccessMui {
    public static void main(String[] args) {
        Defaultui D = new Defaultui();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String :");
        D.name = sc.nextLine();
        D.Print();
        sc.close();

    }
}
