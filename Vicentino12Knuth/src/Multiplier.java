public class Multiplier {

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();

        System.out.println("Multiplying two integers: " + multiplier.multiply(3, 4)); // 12
        System.out.println("Multiplying two decimals: " + multiplier.multiply(2.5, 4.2)); // 10.5
        System.out.println("Multiplying three integers: " + multiplier.multiply(2, 3, 4)); // 24
    }
}
