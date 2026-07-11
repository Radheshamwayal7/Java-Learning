public class SBdelete {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("RadheShyam");
        sb.delete(7, 8);
        System.out.println("Deleted StringBuilder :" + sb);
    }
}
