package personal.test;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
        used = new int[N + 1];
    }

    static int N, M;
    static int[] selected, used;
    static StringBuilder sb = new StringBuilder();

    static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand = selected[k-1] + 1; cand <= N; cand++) {
                selected[k] = cand;
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
