package personal.boj;

import java.util.Scanner;

// 정답 제출시 public class Main{}으로 제출
public class Main1002 {

    static void input() {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();

            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();
        }

    }
    static int t;
    static int x1, x2, y1, y2, r1, r2;


    public static void main(String[] args) {
        input();
    }
}
