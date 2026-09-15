public class Solve {
    public static void main(String[] args) {
        String result = new Solve().longestPalindrome("babad");
        System.out.println("RESULT1: " + result);
    }

    int left, maxLength = 0;

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len < 2) return s;

        for (int i = 0; i < s.length(); i++) {
            searchPalindrome(s, i, i + 1);
            searchPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLength);
    }

    public void searchPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLength < k - j - 1) {
            maxLength = k - j - 1;
            left = j + 1;
        }
    }
}
