public class SantasNumberTrimmingMagic{
  public static void main (String args[]){
    String santasListNumber = "1235";

    //Simple and efficient. No trimming though
    char firstListNumber = santasListNumber.charAt(0);
    char lastListNumber = santasListNumber.charAt(santasListNumber.length() -1);
    StringBuilder correctedList = new StringBuilder();
    correctedList.append(firstListNumber);
    correctedList.append(lastListNumber);
    System.out.println("Santas corrected number: " + correctedList);
  }
} 