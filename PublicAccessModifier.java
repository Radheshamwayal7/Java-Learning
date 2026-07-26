class PublicEx {
        public String name;

        public void Print(){
            System.out.println(this.name);
        }

}

public class PublicAccessModifier {
    public static void main(String[] args) {
        PublicEx Ac = new PublicEx();

        Ac.name = "Radhe Radhe";
        Ac.Print();
    }
}
