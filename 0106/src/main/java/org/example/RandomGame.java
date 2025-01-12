package org.example;

import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        // Scanner 필요
        Scanner scanner = new Scanner(System.in);

        // 당첨값
        int value = (int) (Math.random()*6); // 0~5

        // 반복 처리
        for (int i=0; i<6; i++){
            System.out.println(i + "------");
            if (i == value){
                System.out.println("Selected");
            }//end if
            scanner.nextLine();
        }//end for

    }
}
