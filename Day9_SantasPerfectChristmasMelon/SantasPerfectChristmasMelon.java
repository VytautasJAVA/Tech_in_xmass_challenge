//validation keeps breaking. No time so removed for now. Works with whole numbers and decimal sums
import java.util.Scanner;

public class SantasPerfectChristmasMelon{
    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many melons are being weighed?: ");
        int melonCount = Integer.parseInt(myScanner.nextLine());
        double[] weights = new double[melonCount];
        int melonIndex = 0;

        System.out.println("Please enter the weights:");
        while (melonIndex < melonCount) {
            String userInput = myScanner.nextLine().replace(",", ".").trim();
            double value = Double.parseDouble(userInput);
            weights[melonIndex] = value;  
            melonIndex++;                 
        }
        //Calculating averages
        double sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        double average = sum / melonCount;
        
        //Finding cloesset to average and pulling index
        int closestIndex = 0;
        double melonClosestToAverage = weights[0];
        double smallestDifference = Math.abs(weights[0] - average);
        for (int i = 1; i < weights.length; i++) {
            double difference = Math.abs(weights[i] - average);
            if (difference < smallestDifference) {
                smallestDifference = difference;
                melonClosestToAverage = weights[i];
                closestIndex = i;
            }
        }
        System.out.println("All melon average is: " + average);
        System.out.println("Melon closest to all melon average is at index " + closestIndex +  "weighing " +  melonClosestToAverage);

        myScanner.close();  
    }
}
