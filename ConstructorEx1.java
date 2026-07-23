class ConstructorNonPara {
    String name;
    int age;

    // Non-parameterized constructor
    ConstructorNonPara() {
        System.out.println("Constructor Called");
    }

    public void Printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ConstructorEx1 {
    public static void main(String[] args) {

        ConstructorNonPara s1 = new ConstructorNonPara();

        s1.name = "Sham";
        s1.age = 20;

        s1.Printinfo();
    }
}