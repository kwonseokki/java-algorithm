import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> result = Solve.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // 애너그램 보관을위한 맵 선언
        Map<String, List<String>> results = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            // 문자배열을 키로 사용
            String key = String.valueOf(chars);

            // 키가 없다면 빈 리스트 삽입
            if (!results.containsKey(key))
                results.put(key, new ArrayList<>());
            results.get(key).add(s);
        }

        return new ArrayList<>(results.values());
    }
}
