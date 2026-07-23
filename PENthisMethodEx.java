class Pens {
    String color;
    String type;

    public void Printcolors() {
        System.out.println(this.color);
    }
}

public class PENthisMethodEx {
    public static void main(String[] args) {
        Pens pen1 = new Pens();
        pen1.color = "Blue";
        pen1.type = "Ballpoint";

        Pens pen2 = new Pens();
        pen2.color = "Red";
        pen2.type = "Gel";

        pen1.Printcolors();
        pen2.Printcolors();
    }
}
