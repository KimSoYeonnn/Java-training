package org.example;

import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] arr = new String[2][];

        String[] temp1 = {"바다보다 산이 좋다", "보드 게임을 즐긴다", "매일 일기?"};
        String[] temp2 = {"변화하기 위해 노력한다", "가사가 있는 음악이 좋다", "매일 일기?"};

        arr[0] = temp1;
        arr[1] = temp2;

        //첫 질문과 답변
        System.out.println("운명을 믿나요? yes 0, no 1");
        int a1 = Integer.parseInt(scanner.nextLine());

        String[] nextArr = arr[a1];

        System.out.println(nextArr[0]);
        System.out.println("yes 1, no 2");
        int a2 = Integer.parseInt(scanner.nextLine());

        System.out.println(nextArr[a2]);

    }
}
