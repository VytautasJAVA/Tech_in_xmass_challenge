import java.util.Arrays;
import java.util.Scanner;

public class SantasToyCollectionTradingDuplicates {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many toys Binky has: ");
        int toyCount = scanner.nextInt();

        int[] toyNumbers = new int[toyCount];
        int[] toyNumberingSystem = new int[101];

        System.out.println("Please enter toy numbers (1 to 100, numbers can repeat):");
        for (int i = 0; i < toyCount; i++) {
            int numberingSystem = scanner.nextInt();

            while (numberingSystem < 1 || numberingSystem > 100) {
                System.out.println("Toys can only be numbered from 1 to 100, try again:");
                numberingSystem = scanner.nextInt();
            }
            toyNumbers[i] = numberingSystem;
            toyNumberingSystem[numberingSystem]++; 
        }

        int duplicateCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (toyNumberingSystem[i] > 1) {
                duplicateCount++;
            }
        }
        int[] duplicateToys = new int[duplicateCount];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (toyNumberingSystem[i] > 1) {
                duplicateToys[index++] = i;
            }
        }
        Arrays.sort(duplicateToys);
        System.out.println("Numbered toys up for trade:");
        for (int duplicateToy : duplicateToys) {
            System.out.print(duplicateToy + " ");
        }
        scanner.close();
    }
}