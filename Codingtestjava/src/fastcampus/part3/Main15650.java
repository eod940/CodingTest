package fastcampus.part3;

import java.util.Scanner;

// N과 M()
public class Main15650 {
    static StringBuilder sb = new StringBuilder();

    private static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    static int N, M;
    static int[] selected;

    static void rec_func(int k) {
        if (k == M + 1) { // 1~M 번째를 전부 다 골랐다.
            // selectted[1..M] 배열이 새롭게 탐색된 결과
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int candidate = selected[k-1]; candidate <= N; candidate++) {
                selected[k] = candidate;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();

        rec_func(1);
        System.out.println(sb.toString());
    }
}