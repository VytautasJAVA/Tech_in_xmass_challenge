import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PetersChristmasShoppingDilema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program only accepts three decimal sums separated by a space:");
        List<Double> prices = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            String token = scanner.next();              
            String normalized = token.replace(',', '.'); 
            prices.add(Double.parseDouble(normalized));
        }

        double lowestPrice = Collections.min(prices);
        System.out.println("Peter will spend " + lowestPrice);

        scanner.close();
    }
}