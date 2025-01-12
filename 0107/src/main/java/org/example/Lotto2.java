package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {

    public static void main(String[] args) {

        //금액 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("1번에 1000원");
        int money = Integer.parseInt(scanner.nextLine());

        // 횟수
        int num = money / 1000;

        //공 45개가 들어있는 배열 만들기
        int[] balls = new int[45];
        int len = balls.length;

        for (int i = 0; i<len; i++){
            balls[i] = i+1;
        }

        //System.out.println(Arrays.toString(balls));

        // 결과 들어갈 array
        int[] result = new int[6];

        for (int n=1; n < num+1; n++){
            //0-44까지 수 중에서 6번 임의의 수 뽑기
            for (int i=0; i<6; ) {
                int idx = (int)(Math.random()*45); //임의의 인덱스 번호

                int value = balls[idx]; //공에 적힌 숫자

                //만일 value == -1이면 continue
                if(value==-1){
                    //System.out.println("중복");
                    continue;
                }

                //System.out.println(value);

                //뽑힌 결과 넣기
                result[i] = value;

                //뽑혔으면 뽑혔다는 표시(-1로 바꾸기)
                balls[idx] = -1;
                i++;
            }
            System.out.println(n + " : " +Arrays.toString(result));
        }


    }
}
