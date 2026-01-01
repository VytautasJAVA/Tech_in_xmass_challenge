public class SantasGiftAudit {
  public static void main (String args[]){
    int [][] workshopData = {
      {
        5, 7, 3
      },
      {
        6, 4, 4, 5
      },
      {
        10, 2
      }
    };

    int sumOfAllWorkshops = 0;
    for(int i=0;i<workshopData.length;i++){
      int workshopSum = 0;
      for (int j = 0; j < workshopData[i].length; j++) {
                workshopSum += workshopData[i][j];
            }
            System.out.println("Workshop " + (i + 1) + " made " + workshopSum + " gifts");
            sumOfAllWorkshops += workshopSum;
    }
    System.out.println("Santa’s total gift count is " + sumOfAllWorkshops);
  }
}
