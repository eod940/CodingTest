package personal.boj;

import java.util.Scanner;

// 정답 제출시 public class Main{}으로 제출
public class Main1002 {

    /**
     * 문제점
     * 1. t에 2 이상의 값이 들어가면 출력 ❌
     */

    static StringBuilder sb = new StringBuilder();

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

            sb.append(contact()).append("\n");
        }
    }
    static int t;
    static int x1, x2, y1, y2, r1, r2;

    public static int contact() {

        // 중점간 거리
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // case 1 : 중점이 같으면서 반지름도 같을 경우
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
        else if(distance > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
        else if(distance < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        // case 3-1 : 내접할 때
        else if(distance == Math.pow(r2 - r1, 2)) {
            return 1;
        }


        // case 3-2 : 외접할 때
        else if(distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        else {
            return 2;
        }
    }


    public static void main(String[] args) {

        input();

        System.out.println(sb);
    }
}
