import java.util.*;

public class TextTreeFormatter {

    public static void main(String[] args) {

        String[] input = {
            "Ei, drauguži, žiemos vidury",
            "Roges jei turi, tai gerai!",
            "Į kalną aukščiausią, patį balčiausią",
            "Įkopt jei gali, tai gerai!"
        };

        List<String> allRearranged = new ArrayList<>();

        for (String line : input) {
            allRearranged.addAll(rearrange(line));
        }
        int trunk = 20;
        for (int i = 0; i < allRearranged.size(); i++) {
            String s = allRearranged.get(i);

            if (i % 2 == 0) {
                int spaces = trunk - s.length();
                System.out.println(" ".repeat(Math.max(0, spaces)) + s);
            } else {
                System.out.println(" ".repeat(trunk) + s);
            }
        }
    }

    private static List<String> rearrange(String line) {
        String[] words = line.trim().split("\\s+");
        List<String> result = new ArrayList<>();

        int index = 0;
        int count = 1;

        while (index < words.length) {
            int end = Math.min(index + count, words.length);
            StringBuilder sb = new StringBuilder();

            for (int i = index; i < end; i++) {
                sb.append(words[i]);
                if (i < end - 1) sb.append(" ");
            }

            result.add(sb.toString());
            index = end;
            count++;
        }
        return result;
    }
}