public class Solution01 {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        boolean result = solution01.solution("Do geese see God?");
        System.out.println("Result: " + result);
    }

    public boolean solution(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
