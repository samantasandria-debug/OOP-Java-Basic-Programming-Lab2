public class BinaryMultiplication {
    public static void main(String[] args) {
        String b1 = "10";
        String b2 = "11";

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        int product = n1 * n2;

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }
}
