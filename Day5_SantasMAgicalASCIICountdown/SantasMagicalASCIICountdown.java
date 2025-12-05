//Wasnt the challenge language agnostic?Sorry but im sticking to java for practise :) 
//Reading up on it i can see why you chose js over java. Emoji encoding problems in console

public class SantasMagicalASCIICountdown {
    public static void main(String[] args) throws InterruptedException{
        int countdownStart = 10;

        for (int i = countdownStart; i > 0; i--) {
            String[] digitArt = AsciiDigits.countDownASCIIDigits[i - 1];
            for (String line : digitArt) {
                System.out.println(line);
            }
            System.out.println(); 
            System.out.println(FestiveMessages.festiveQuotes[i - 1]);
            System.out.println(); 
            //trick to make this into a proper countdown
            Thread.sleep(1000);
        }

        System.out.println("🎅✨ SANTA’S SLEIGH IS LAUNCHING! ✨🎅");
    }
}