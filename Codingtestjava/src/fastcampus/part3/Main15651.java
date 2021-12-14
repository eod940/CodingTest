package fastcampus.part3;

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    static int N, M;
    static int [] selected;

    /**
     * Recurrence Func.
     * 만약 M개를 전부 골랐다면, 조건에 맞는 탐색 1번 성공
     * M개를 고르지 않았다면, k번째부터 M번째 까지 조건에 맞게 고르는 모든 방법을 시도한다.
     * */
    static void rec_func(int k) {
        // M + 1이 되면 k값을 다 찾은 것이므로
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');

        } else {
            for (int candidate = 1; candidate <= N; candidate++) {
                selected[k] = candidate;
                // k+1 ~ M 번을 모두 탐색해야하는 상황
                rec_func(k+1);
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
