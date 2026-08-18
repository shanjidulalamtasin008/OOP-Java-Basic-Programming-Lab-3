import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String bin = sc.nextLine();

        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Decimal Number: " + decimal);
    }
}
