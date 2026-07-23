class Students {
    String name;
    int age;

    public void Printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(Students s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Students() {

    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Radhe";
        s1.age = 20;

        Students s2 = new Students(s1);
        s2.Printinfo();

    }
}
