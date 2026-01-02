//edited day 16 solution

public class SantasShoppingTrip {
    public static void main(String[] args) {

        double[][] storeData = {
            { 
                1.07, 2.92, 3.45, 1.09, 0.89 
            },
            { 
                1.08, 2.35, 3.75, 1.12, 0.69 
            },
            { 
                0.98, 2.48, 3.62, 1.10, 0.72 
            }
        };

        double totalSpent = 0;

        for (int i = 0; i < storeData.length; i++) {

            int storeNumber = i + 1;
            int itemCount = storeData[i].length;

            double totalSpentAtStore = 0;
            for (int j = 0; j < storeData[i].length; j++) {
                totalSpentAtStore += storeData[i][j];
            }
            //enough to get wanted result
            System.out.printf("Store %d sold %d items. Total spent: %.2f%n", storeNumber, itemCount, totalSpentAtStore);
            totalSpent += totalSpentAtStore;
        }

        System.out.printf("Total spent: %.2f%n", totalSpent);
    }
}