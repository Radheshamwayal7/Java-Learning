class Student6 {
    String name;
    static String School;

    public void Print() {
        System.out.println(this.name);
    }
}

public class StaticInJava {
    public static void main(String[] args) {
        Student6 s = new Student6();
        s.name = "Sanika";
        s.Print();
        Student6.School = "Samarth";
        System.out.println(Student6.School);
    }
}
