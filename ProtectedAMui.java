import java.util.Scanner;

class ProtectedUI {
    protected String Email;

    void print(){
        System.out.println("The Email Is :" + this.Email);
    }
}

class ProtectedAMui {
    public static void main(String[] args) {
        ProtectedUI P = new ProtectedUI();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Email :");
        P.Email = sc.nextLine();
        P.print();
        sc.close();

    }
}
