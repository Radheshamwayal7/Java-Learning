import java.util.Scanner;

class PrivateUI {
    private String password;

    //getter
    public String getPassword() {
        return this.password;
    }

    //setter
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class PrivateAMui {
    public static void main(String[] args) {
        PrivateUI pui = new PrivateUI();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Password :");
        String pass = sc.nextLine();
        pui.setPassword(pass);
        System.out.println("The Password Is :"+ pui.getPassword());
        sc.close();
    }
}
