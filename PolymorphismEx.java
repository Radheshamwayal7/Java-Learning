class PolyMor {
    String name;
    int age;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void PrintInfo(String name) {
        System.out.println(this.name);

    }

    public int PrintInfo(int age) {
        System.out.println(age);
        return age;
    }

    public void PrintInfo(String name , int age) {
        System.out.println(name);
        System.out.println(age);
    }

}

public class PolymorphismEx {
    public static void main(String[] args) {
        
        PolyMor pm  = new PolyMor();

        pm.name = "Krishna";
        pm.age = 22;
        pm.PrintInfo(pm.name);
    }
}
