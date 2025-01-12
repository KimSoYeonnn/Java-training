package org.example;

import java.util.Scanner;

public class RPS3wins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int streak = 0;

        while (streak < 3){
            System.out.print("S(0), R(1), P(2) : ");
            int user = scanner.nextInt();

            int com = (int) (Math.random() * 3); // 0, 1, 2 중 하나
            System.out.println("USER : " + user);
            System.out.println("COM : " + com);

            // 결과 행렬
            String[][] results = {
                    {"tied.", "lose", "win"},
                    {"win", "tied.", "lose"},
                    {"lose", "win", "tied."}
            };
            String result = results[user][com];

            // 결과 출력
            System.out.println(result);

            // 연승 계산
            if (result.equals("win")) {
                streak++; // 승리하면 연승 카운트 증가
                System.out.println("Current streak: " + streak);
            } else {
                streak = 0; // 패배 또는 무승부 시 연승 초기화
                System.out.println("Streak reset. Current streak: " + streak);
            }
        }


    }
}
