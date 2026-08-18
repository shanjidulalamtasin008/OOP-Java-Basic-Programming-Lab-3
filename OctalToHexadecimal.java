import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a octal number : ");
        String oct = sc.nextLine();

        int decimal = Integer.parseInt(oct, 8);
        System.out.println("Equivalent hexadecimal number is: " + Integer.toHexString(decimal).toUpperCase());
    }
}
