public class ChristmasLightsPatternGenerator{
  public static void main (String args[]){
    int rowAndGridcount = 10;
    int max = (rowAndGridcount + rowAndGridcount);
    int width = String.valueOf(max).length() + 1;
    
    for (int k = 0; k < rowAndGridcount * width + 3; k++) {
            System.out.print("#");
        }
        System.out.println();
    for (int i = 0; i < rowAndGridcount; i++) {
        System.out.print("#");
        for (int j = 0; j < rowAndGridcount; j++) {
            int grid = (i + 1) + (j + 1);
            String fizzbuzz;
                if (grid % 3 == 0 && grid % 5 == 0) {        
                    fizzbuzz = "G";               
                } else if (grid % 3 == 0) {
                    fizzbuzz = "T";
                } else if (grid % 5 == 0) {
                    fizzbuzz = "S";
                } else {
                    fizzbuzz = ".";
                }
            System.out.printf("%" + width + "s", fizzbuzz);
        }
        System.out.print(" #");
        System.out.println();
        }
    for (int k = 0; k < rowAndGridcount * width + 3; k++) {
            System.out.print("#");
        }
        System.out.println();
      }
}