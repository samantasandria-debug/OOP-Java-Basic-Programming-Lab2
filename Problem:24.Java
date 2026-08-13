public class BinaryToOctal {
    public static void main(String[] args) {
        String bin = "111";
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Octal number: " + Integer.toOctalString(decimal));
    }
}
