//a wasted opportunity to think about clock angle calculations. Solution brings the same result as day6, flight schedule solution

import java.time.Duration;
import java.time.LocalTime;

public class SantasSpinningClockMystery {
  public static void main (String args[]){
    int hours = 23;
    int minutes = 35;
    LocalTime startingTime = LocalTime.of(hours, minutes);
    Duration oneFullRotationOfMinuteDial = Duration.ofHours(1);
    LocalTime resultTime = startingTime.plus(oneFullRotationOfMinuteDial);

    System.out.println("If starting time is: " + startingTime + " then resulting time after one minute handle complete coration on an analog clock is: " + resultTime);
  }
}
