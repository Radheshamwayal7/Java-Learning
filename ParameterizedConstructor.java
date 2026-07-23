class Student {
    String name;
    int age;

    public void Printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Radhe" , 20);
        s1.Printinfo();
    }
}
