package personal.boj;

import java.util.Scanner;

// A-B

class Main {
    static int a,b;

    static void input(){
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    static void minus(int a,int b){
        int result = a - b;
        System.out.println(result);
    }

    public static void main(String[]args){
        input();
        minus(a,b);
    }
    /*
    * 아래는 검색했을 때 나온 답
    * */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a - b);
//    }
}
