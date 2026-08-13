public class OctalToHex {
    public static void main(String[] args) {
        String oct = "100";
        int decimal = Integer.parseInt(oct, 8);
        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());
    }
}
