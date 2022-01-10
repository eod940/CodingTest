package fastcampus.part3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * /problem/15651 : N과 M(3)
 *
 * 문제
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 *
 * 1부터 N까지 자연수 중에서 M개를 고른 수열
 * 같은 수를 여러 번 골라도 된다.
 *
 * 입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)
 *
 * 출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 *
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class Main15651 {
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
        if (k == M + 1) { // 다 골랐을 경우
            // selected[1...M] 배열이 새롭게 탐색된 경우
            System.out.println("1. selected = " + Arrays.toString(selected));
            for (int i=1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            // 1~N 까지를 k번 원소로 한 번씩 정함.
            // 매번 k+1번부터 M번 원소로 출발
            System.out.println("2. selected = " + Arrays.toString(selected));
            for (int candidate = 1; candidate <= N; candidate++) {
                selected[k] = candidate;
                // k+1 ~ M 을 모두 탐색
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
