package fastcampus.part3;

import java.util.Scanner;

// N과 M(1)
public class Main15649 {
    static StringBuilder sb = new StringBuilder();

    private static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    static int N, M;
    static int [] selected;

    static void rec_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M + 1; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int candidate = 1; candidate <= N; candidate++) {
                boolean isUsed = false;

                for (int i=1; i<k; i++)
                    if (candidate == selected[i])
                        isUsed = true;
                // k 번째에 candidate가 올 수 있다면
                if (!isUsed) {
                    selected[k] = candidate;
                    rec_func(k + 1);
                    selected[k] = 0;
                }
            }
        }
    }

    public static void main(String[]args) {
        input();

        rec_func(1);
        System.out.println(sb.toString());
    }
}
