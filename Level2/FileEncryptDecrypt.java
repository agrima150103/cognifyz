import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("File Encryption/Decryption Program");
        System.out.print("Do you want to encrypt or decrypt? (e/d): ");
        String choice = sc.nextLine();

        System.out.print("Enter the key (number): ");
        int key = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        try {
            // Read file content
            FileReader reader = new FileReader(inputFile);
            String content = "";
            int ch;
            while ((ch = reader.read()) != -1) {
                content = content + (char)ch;
            }
            reader.close();

            // Encrypt or decrypt
            String result = "";
            for (int i = 0; i < content.length(); i++) {
                char c = content.charAt(i);
                if (choice.equalsIgnoreCase("e")) {
                    result = result + (char)(c + key);
                } else if (choice.equalsIgnoreCase("d")) {
                    result = result + (char)(c - key);
                }
            }

            // Write to output file
            FileWriter writer = new FileWriter(outputFile);
            writer.write(result);
            writer.close();

            if (choice.equalsIgnoreCase("e")) {
                System.out.println("File encrypted successfully.");
            } else if (choice.equalsIgnoreCase("d")) {
                System.out.println("File decrypted successfully.");
            } else {
                System.out.println("Invalid choice.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
