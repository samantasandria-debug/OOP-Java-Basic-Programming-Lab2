public class BinaryToHex {
    public static void main(String[] args) {
        String bin = "1101";
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("HexaDecimal value: " + Integer.toHexString(decimal).toUpperCase());
    }
}
