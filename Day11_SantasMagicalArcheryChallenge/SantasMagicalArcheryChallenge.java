public class SantasMagicalArcheryChallenge {
    public static void main(String[] args) {
        double xOfCenter = 0; 
        double yOfCenter = 0;
        double[] ringRadius = {1, 5, 10};
        int[] points = {10, 5, 1};
        double[][] eVeryDartCoordinateAfterShot = {{0.5, 0.5}, {1.5, 1.8}};
        int totalPlayerScore = 0;

        for (double[] dart : eVeryDartCoordinateAfterShot) {
            double xOfDart = dart[0];
            double yOfDart = dart[1];
            double distance = Math.sqrt(Math.pow(xOfDart - xOfCenter, 2) + Math.pow(yOfDart - yOfCenter, 2));
            int score = 0;

            for (int i = 0; i < ringRadius.length; i++) {
                if (Math.abs(distance - ringRadius[i]) < 1e-9) {
                    score = points[i] / 2;
                    break;
                } else if (distance < ringRadius[i]) {
                    score = points[i];
                    break;
                }
            }
            totalPlayerScore =+ score;
            System.out.println("Dart at position " + xOfDart + " (x) " + " " + yOfDart + " (y) " + " earned " +  score + " points");
        }
        System.out.println("This elf has scored a total of " + totalPlayerScore + " points");
    }
}