package fastcampus.part3;

import java.util.Scanner;

// N과 M(4)
public class Main15652 {
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
        p = new int[M + 1];
    }

    static int N, M;
    static int [] selected, p;

    static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            int start = selected[k-1];
            if(start == 0)
                start = 1;
            for (int cand = start; cand <= N; cand++) {
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
