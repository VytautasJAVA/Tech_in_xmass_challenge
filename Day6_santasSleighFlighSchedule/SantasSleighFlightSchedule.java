import java.time.LocalTime;
import java.time.Duration;

public class SantasSleighFlightSchedule {
    public static void main(String[] args) {

      LocalTime takeOffTime = LocalTime.of(23, 15);
      Duration flightDuration = Duration.ofHours(1).plusMinutes(30);
      LocalTime landingTime = takeOffTime.plus(flightDuration);
      long hours = flightDuration.toHours();
      long minutes = flightDuration.toMinutes() % 60;

      System.out.println("If santa takes off with his sleigh at " + takeOffTime +" and his flight lasts " + hours + ":" + minutes + " then he will land at " + landingTime);
    }
}