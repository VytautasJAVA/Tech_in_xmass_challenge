import java.util.*;

public class SantasMagicWordWorkshopAnagramGroups {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> hMap = new HashMap<>();

        for (String word : words) {
            char[] charsToSort = word.toCharArray();
            Arrays.sort(charsToSort);
            String sorted = new String(charsToSort);
            hMap.putIfAbsent(sorted, new ArrayList<>());
            hMap.get(sorted).add(word);
        }
        List<List<String>> grouped = new ArrayList<>(hMap.values());

        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
}