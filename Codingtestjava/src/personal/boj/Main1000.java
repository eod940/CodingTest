package personal.boj;

import java.util.Scanner;

public class Main1000 {
    static class Main {
        static int a, b;

        static void input() {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
        }

        public static void main(String[] args) {
            input();
            System.out.println(a+b);
        }
    }
}
