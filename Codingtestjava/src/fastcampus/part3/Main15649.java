package fastcampus.part3;

import java.util.Scanner;

// N과 M(1)
public class Main15649 {

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M+1];
        indicator = new int[N+1];
    }

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected, indicator;

    static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                if (indicator[cand] == 1)
                    continue;
                selected[k] = cand;
                indicator[cand] = 1;
                rec_func(k + 1);
                selected[k] = 0;
                indicator[cand] = 0;
            }
        }
    }

    public static void main(String[] args) {

        input();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
