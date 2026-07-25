class Inheritence {
    String name;
    int age;

    public void Print(){
        System.out.println("The Name Is :"+ name);
        System.out.println("The Age Is :"+ age);
    }
}

class StudentInfo extends Inheritence {

}

public class InheritenceEx {
    public static void main(String[] args) {
        Inheritence In = new Inheritence();

        In.name = "Sanu";
        In.age = 20;

        In.Print();
    }
}
