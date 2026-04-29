import java.util.Scanner;
import org.json.JSONObject;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter (Simulated API)");

        System.out.print("Enter base currency code (e.g., USD): ");
        String base = sc.nextLine().toUpperCase();

        System.out.print("Enter target currency code (e.g., INR): ");
        String target = sc.nextLine().toUpperCase();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        // ----------------------
        // Simulated API JSON data (as if we got it from an API)
        String jsonResponse = "{ \"rates\": { \"INR\": 83.0, \"EUR\": 0.91, \"USD\": 1.0 } }";
        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONObject rates = jsonObject.getJSONObject("rates");

        if (!rates.has(target)) {
            System.out.println("Conversion rate for target currency not available.");
        } else {
            double rate = rates.getDouble(target);
            double converted = amt * rate;
            System.out.printf("%.2f %s = %.2f %s%n", amt, base, converted, target);
        }

        sc.close();
    }
}
