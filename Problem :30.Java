public class HexToOctal {
    public static void main(String[] args) {
        String hex = "40";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Equivalent of octal number is: " + Integer.toOctalString(decimal));
    }
}
