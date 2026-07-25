class Shape {
    String name;

    public void Print() {
        System.out.println("Triangle");
    }
}

class Shapename extends Shape {

}

public class SingleLevelInheritence{
    public static void main(String[] args) {
        Shapename sn = new Shapename();

        sn.Print();
    }
}