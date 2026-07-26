class DefaultAM {
    String name;

    void Print() {
        System.out.println(this.name);
    }
}

class DefaultAccessM {
    public static void main(String[] args) {
        DefaultAM D = new DefaultAM();

        D.name = "RAM";
        D.Print();
    }
}
