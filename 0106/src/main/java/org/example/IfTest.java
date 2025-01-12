package org.example;

public class IfTest {
    public static void main(String[] args) {

        // 랜덤 int 값 만들기]
        //   Math.random : 0.0 ~ 0.9999
        //   Math.random * 3 : ~2.9999
        int value = (int) (Math.random() * 6) + 1; // 1~6까지 랜덤

        System.out.println(value);

        int oddEven = value % 2; // 2로 나눈 나머지 0, 1

        // 만일 oddEven이 0이면 짝수 출력
        String result = oddEven == 1? "홀수" : "짝수";
        System.out.println(result);
    }
}
