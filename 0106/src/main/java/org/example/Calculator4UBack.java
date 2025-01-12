package org.example;

import java.util.Scanner;

public class Calculator4UBack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //변수
        int sum = 0;
        int before = 0;

        //로직
        while (true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();

            if (str.equals("END")){
                break;
            }

            if (str.equals("B")) {
                sum -= before;
                System.out.println("Sum : " + sum);
                continue;
            }

            int money = Integer.parseInt(str);
            sum = sum + money;
            before = money;

            System.out.println("Sum : " + sum);
        }//end while

        System.out.println("Total money is " + sum);
    }
}
