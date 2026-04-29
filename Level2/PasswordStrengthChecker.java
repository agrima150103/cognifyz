import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        int strengthPoints = 0;

        // Check length
        if (pwd.length() >= 8) {
            strengthPoints++;
        }

        // Check for lowercase letter
        if (pwd.matches(".*[a-z].*")) {
            strengthPoints++;
        }

        // Check for uppercase letter
        if (pwd.matches(".*[A-Z].*")) {
            strengthPoints++;
        }

        // Check for digit
        if (pwd.matches(".*\\d.*")) {
            strengthPoints++;
        }

        // Check for special character
        if (pwd.matches(".*[!@#$%^&*()_+=\\-\\[\\]{};':\"\\\\|,.<>/?].*")) {
            strengthPoints++;
        }

        // Provide feedback
        if (strengthPoints <= 2) {
            System.out.println("Password Strength: Weak");
        } else if (strengthPoints == 3 || strengthPoints == 4) {
            System.out.println("Password Strength: Moderate");
        } else {
            System.out.println("Password Strength: Strong");
        }

        sc.close();
    }
}
