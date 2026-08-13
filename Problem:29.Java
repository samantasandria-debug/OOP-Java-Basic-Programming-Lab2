public class HexToBinary {
    public static void main(String[] args) {
        String hex = "37";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(decimal));
    }
}
