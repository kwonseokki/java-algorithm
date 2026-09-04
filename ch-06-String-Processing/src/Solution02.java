public class Solution02 {
    public static void main(String[] args) {}

    public boolean solution(String s) {
        // 클래스를 사용해서 비교하기 때문에 단순 접근 비교인 Solution01 보다 속도가 느리다.
        String s_filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String s_revered = new StringBuilder(s_filtered).reverse().toString();

        return s_filtered.equals(s_revered);
    }
}
