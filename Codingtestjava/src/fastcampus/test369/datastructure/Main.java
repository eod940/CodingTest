package fastcampus.test369.datastructure;

public class Main {
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i<=n; i++) {
            result += i;
        }
        return result;
    }

    public static int sum2(int n) {
        return n * (n+1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("sum(10) = " + sum(10));
        System.out.println("sum2(10) = " + sum2(10));
    }
}
