public class SantasMagicJuiceBottlingChallenge {
  public static void main (String args[]){
    int [] juiceAmounts = {45, 92, 33};
      for (int amount : juiceAmounts) {
            int divBy5 = amount / 5;
            int mod5 = amount % 5;
            int divBy2 = mod5 / 2;
            int mod2 = mod5 % 2;
            int divBy1 = mod2 / 1;
            //easyer to read
            System.out.println("5L barrels: " + divBy5 + ", 2L barrels: " + divBy2 + ", 1L barrels: " + divBy1);
        }

  }
}
