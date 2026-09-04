public class factorial {
    public static void main(String[] args) {
        factorial f = new factorial();

        int result = f.factorial(5);

        System.out.println(f.count);
    }

    int count = 0;

    public int factorial(int n) {
        if (n >= 1) {
            count++;
            return n * factorial(n - 1);
        }
        else {
            count++;
            return 1;
        }
    }
}

