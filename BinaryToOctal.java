import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String bin = sc.nextLine();

        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Octal number: " + Integer.toOctalString(decimal));
    }
}
