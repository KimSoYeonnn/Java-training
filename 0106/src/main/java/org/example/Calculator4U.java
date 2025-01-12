package org.example;

import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //변수
        int sum = 0;

        //로직
        while (true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();

            if (str.equals("END")){
                break;
            }
            int money = Integer.parseInt(str);
            sum = sum + money;

        }//end while

        System.out.println("Total money is " + sum);
    }
}
