public class SantasChristmasConcertSeatingPlan{
  public static void main (String args[]){
    int rowsOfSeats = 3;
    int firstRowSeats = 8;
    int seatsInTotal = 0;
    for(int i = 0; i < rowsOfSeats; i++){
      int seatsInThisRow = firstRowSeats + (i * 2);
      seatsInTotal += seatsInThisRow;
    }
    System.out.println("Total seats in santa concert hall: " + seatsInTotal);
  }
}