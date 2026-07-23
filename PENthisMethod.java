class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void Printcolor() {
        System.out.println(this.color);
    }
}

public class PENthisMethod {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.Printcolor();
    }
}