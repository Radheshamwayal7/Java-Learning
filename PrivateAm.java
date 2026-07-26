class PrivateEx{
    private String Password;

    //getter
    public String getPassword() {
        return this.Password;
    }

    //setter
    public void setPassword(String pass) {
        this.Password = pass;
    }
}

public class PrivateAm {
    public static void main(String[] args) {
        PrivateEx p = new PrivateEx();

        p.setPassword("Abcd");
        System.out.println(p.getPassword());
    }
}
