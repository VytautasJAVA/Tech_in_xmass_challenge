public class SantasMidnightClockCountdown{
  public static void main(String args[]){
    int clockShowsHours = 8;
    int clockShowsMinutes = 31;

    //Presuming from the example that this is an electronic clock
    if( clockShowsHours < 0 || clockShowsHours > 23){
      System.out.println("Hours cannot go higher than 23 or lower then 0");
    }else if(clockShowsMinutes < 0 || clockShowsMinutes > 59){
      System.out.println("Minutes cannot go higher than 59 or lower then 0");
    }else{
      int totalMinutes = (clockShowsHours * 60) + clockShowsMinutes;
      int totalSeconds = (clockShowsHours * 3600) + (clockShowsMinutes * 60);
      System.out.println("Total minutes: " + totalMinutes);
      System.out.println("Total seconds: " + totalSeconds);
    }
  }
}