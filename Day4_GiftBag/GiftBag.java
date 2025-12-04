import java.util.Scanner;

public class GiftBag {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter individual price of items.");
        System.out.println("Enter one price at a time, press Enter after each.");
        System.out.println("When finished, enter 0 to start the calculations.");
        double sumOfMoreThanTenPrice = 0;
        int toysValuedMoreThenTenCount = 0;
        //basic validation searching for zero
        while (true) {
            String userInput = myScanner.nextLine().replace(",", ".").trim();
            if (userInput.equals("0")) {
                break;
            }
            try {
                double userInputValue = Double.parseDouble(userInput);
                if (userInputValue > 10) {
                    sumOfMoreThanTenPrice += userInputValue;
                    toysValuedMoreThenTenCount++;
                }
                //ignoring letters
            } catch (NumberFormatException e) {
                System.out.println("Invalid entries (example: letters,symbols) will be ignored");
            }
        }
        System.out.println("Number of magical toys(that cost more then 10): " + toysValuedMoreThenTenCount);
        System.out.println("Their total value: " + sumOfMoreThanTenPrice);
        myScanner.close();
    }
}