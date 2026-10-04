public class Main {
    public static void main(String[] args) {
        double a = 295.04;
        byte c = (byte) a; // Overflow occurs, outputs 39
        System.out.print(c);
    }
}