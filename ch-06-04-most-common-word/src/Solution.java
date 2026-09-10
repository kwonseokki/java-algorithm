import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String result = Solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        // 비교 연산을 위해서 편의상 Set으로 선언
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> counts = new HashMap<>();

        // 문자열 전처리
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String w : words) {
            if (!ban.contains(w)) {
                counts.put(w, counts.getOrDefault(w, 0) + 1);
            }
        }

        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
