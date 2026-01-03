//example counts Sparkfoots call bill wrong
import java.util.Arrays;

public class SantasChristmasCallCenterBillingTask {
  public static void main(String args[]){
        String[][] elves = {
            { "Jingle", "Sparkfoot", "London", "12", "Paris", "7" },
            { "Twinkle", "Icicletoes", "NewYork", "20", "London", "5" },
            { "Pudding", "Gumdrops", "Paris", "15" }
        };

        String[][] priceList = {
            { "London", "0.50" },
            { "Paris", "0.40" },
            { "NewYork", "0.70" }
        };
        
        Arrays.sort(elves, (a, b) -> a[1].compareTo(b[1]));
        double totalCallCost = 0;

        for (int i = 0; i < elves.length; i++) {
            String firstName = elves[i][0];
            String lastName  = elves[i][1];
            double elfCallCost = 0;

            for (int j = 2; j < elves[i].length; j += 2) {
                String city = elves[i][j];
                int minutes = Integer.parseInt(elves[i][j + 1]);

                double price = 0;
                for (int k = 0; k < priceList.length; k++) {
                    if (priceList[k][0].equals(city)) {
                        price = Double.parseDouble(priceList[k][1]);
                        break;
                    }
                }
                elfCallCost += minutes * price;
            }
            totalCallCost += elfCallCost;
            System.out.printf("%s %s %.2f%n", lastName, firstName, elfCallCost);
        }
        System.out.printf("Total: %.2f%n", totalCallCost);
      };
}
