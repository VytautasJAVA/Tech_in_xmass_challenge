import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SantasGiftCartEngine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> gifts = new HashMap<>();
        double discount = 0.0;
        Map<String, Double> promoCodes = new HashMap<>();
        promoCodes.put("PROMO10", 0.10);
        promoCodes.put("PROMO25", 0.25);
        promoCodes.put("SANTA50", 0.50);
        System.out.println("Program commands:");
        System.out.println("1. cart.add(\"id\", price)");
        System.out.println("2. cart.remove(\"id\")");
        System.out.println("3. cart.total()");
        System.out.println("4. cart.applyDiscount(\"PROMO10\")");
        System.out.println("5. end");

        while (true) {
            String userInput = scanner.nextLine().trim();

            if (userInput.startsWith("cart.add(")) {
                String inside = userInput.substring("cart.add(".length(), userInput.length() - 1);
                String[] parts = inside.split(",");
                if (parts.length == 2) {
                    String id = parts[0].trim().replace("\"", "");
                    double price = Double.parseDouble(parts[1].trim());
                    if (gifts.containsKey(id)) {
                        System.out.println("ID already exists");
                    } else {
                        gifts.put(id, price);
                        System.out.println("Gift added: " + id + " " + price);
                    }
                } else {
                    System.out.println("Incorrect input. Try again");
                }

            } else if (userInput.startsWith("cart.remove(")) {
                String inside = userInput.substring("cart.remove(".length(), userInput.length() - 1);
                String id = inside.trim().replace("\"", "");
                if (gifts.remove(id) != null) {
                    System.out.println("Gift removed " + id);
                } else {
                    System.out.println("ID not found");
                }

            } else if (userInput.equals("cart.total()")) {
                double sum = 0.0;
                for (double price : gifts.values()) {
                    sum += price;
                }
                double giftSumTotal = sum - (sum * discount);
                System.out.println("Total sum of gifts: " + giftSumTotal);

            } else if (userInput.startsWith("cart.applyDiscount(")) {
                String inside = userInput.substring("cart.applyDiscount(".length(), userInput.length() - 1);
                String code = inside.trim().replace("\"", "");
                if (promoCodes.containsKey(code)) {
                    discount = promoCodes.get(code);
                    System.out.println("Promo code has been applied");
                } else {
                    System.out.println("Promo code not found");
                }
            
            } else if (userInput.equals("end")) {
                System.out.println("Program closed");
                break;
            
            } else {
                System.out.println("Command unrecognized. Try again");
            }
        }

        scanner.close();
    }
}