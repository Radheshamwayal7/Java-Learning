class ProtectedEx {
    protected String Email;

    void Print() {
        System.out.println("The Email Is :" + this.Email);
    }
}

public class ProtectedAM {
    public static void main(String[] args) {
        ProtectedEx P = new ProtectedEx();

        P.Email = "abc1@gmail.com";
        P.Print();
    }
}
