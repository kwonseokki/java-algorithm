import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solve {
    public static void main(String[] args) {
        List<List<String>> result = Solve.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // 문자를 정렬하여 비교한다
        // 정렬한 결과가 키로 존재한다면 해당 문자를 추가한다.

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String keyStr = new String(charArr);

            if (map.containsKey(keyStr)) {
                map.get(keyStr).add(str);
            } else {
                List<String> arrayList = new ArrayList<>(Arrays.asList(str));
                map.put(keyStr, arrayList);
            }
        }

        return map.values().stream().toList();
    }
}
