package Day1_SantasTilingTrouble;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SantasTilingTrouble {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		try{
			System.out.println("Please enter room length: ");
				int length = scanner.nextInt();
				System.out.println("Please enter room width: ");
				int width = scanner.nextInt();
				System.out.println("Please enter tile price: ");
				String priceInput = scanner.next();
				priceInput = priceInput.replace(",", ".");
				double m2price = Double.parseDouble(priceInput);

				if (length <= 0 || width <= 0 || m2price <= 0.01 ) {
                System.out.println("Width and length cannot be less or equal to 0. Price cannot go lower then 1 cent");
				}else{
					int area = length * width;
					double costForArea = area * m2price;
					double tileErrorMarginPercentage = 1.05;
					double fullPrice = costForArea * tileErrorMarginPercentage;
					double surplusTileCost = fullPrice - costForArea;

					//Formating
					DecimalFormat resultFormater = new DecimalFormat("#.##");

					
					System.out.println("Tile price for room: " + resultFormater.format(costForArea));
					System.out.println("Cost of surplus tiles: " + resultFormater.format(surplusTileCost));
					System.out.println("Total cost for Santa: " + resultFormater.format(fullPrice));
				}
				
		} catch (Exception e) {
         System.out.println("Program only accepts whole numbers for width and length,  and numbers with decimals for price");
		}
				
		scanner.close();		
		}
}
