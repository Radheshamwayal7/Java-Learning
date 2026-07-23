class pen {
    String color;
    String Type;

        public void write() {
            System.out.println("Writing Something");
    }
}

public class DryRunPen {
    public static void main(String[] args) {
        
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.Type = "Ballpoint";

        pen1.write();

    }
}