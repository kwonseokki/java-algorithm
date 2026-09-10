import java.util.*;

public class Solve {
    public static void main(String[] args) {
        String result = Solve.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
        System.out.println("RESULT: " + result);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] wordList = paragraph.split("[ ,.?!;']+");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toLowerCase();

            if (Arrays.asList(banned).contains(wordList[i])) {
                continue;
            }

            if (map.containsKey(wordList[i])) {
                map.put(wordList[i], map.get(wordList[i]) + 1);
            } else {
                map.put(wordList[i], 1);
            }
        }

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), comparator);

        return maxEntry.getKey();
    }
}
