public class Solve1 {
    public static void main(String[] args) {
        Solve1 solve1 = new Solve1();
        solve1.solution(new char[]{'r', 'a', 'c', 'e', 'c', 'a', 'r'});
    }

    public void solution(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        System.out.println(s);
    }
}
