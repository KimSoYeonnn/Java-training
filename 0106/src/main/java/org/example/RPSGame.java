package org.example;

import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        String str = scanner.nextLine();
        System.out.println(str);

        // 사용자 값
        int user = Integer.parseInt(str);

        // 컴 값
        int com = (int) (Math.random()*3);

        // user가 com보다 작으면 3을 더해라
        user = user < com ? user+3: user;

        int result = user - com; //0,1,2

        System.out.println("USER : " + user);
        System.out.println("COM : " + com);

        switch (result){
            case 0:
                System.out.println("tied");
                break;
            case 1:
                System.out.println("win");
                break;
            case 2:
                System.out.println("lose");
                break;
        }//end switch

    }
}
