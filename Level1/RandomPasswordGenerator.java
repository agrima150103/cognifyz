import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()";

        String allowedChars = "";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Include numbers? (yes/no): ");
        String ch = sc.nextLine();
        if (ch.equalsIgnoreCase("yes")) {
            allowedChars += numbers;
        }

        System.out.print("Include lowercase letters? (yes/no): ");
        ch = sc.nextLine();
        if (ch.equalsIgnoreCase("yes")) {
            allowedChars += lowercase;
        }

        System.out.print("Include uppercase letters? (yes/no): ");
        ch = sc.nextLine();
        if (ch.equalsIgnoreCase("yes")) {
            allowedChars += uppercase;
        }

        System.out.print("Include special characters? (yes/no): ");
        ch = sc.nextLine();
        if (ch.equalsIgnoreCase("yes")) {
            allowedChars += specialChars;
        }

        if (allowedChars.isEmpty()) {
            System.out.println("You must select at least one character type.");
            return;
        }

        String pwd= "";

        for (int i = 0; i < length; i++) 
        {
            int d = rand.nextInt(allowedChars.length());
            pwd= allowedChars.charAt(d);
        }
        System.out.println("Generated password: " + pwd);
    }
}
