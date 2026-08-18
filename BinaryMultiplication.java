import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String bin1 = sc.nextLine();
        System.out.print("Input the second binary number: ");
        String bin2 = sc.nextLine();

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int product = num1 * num2;

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }
}
