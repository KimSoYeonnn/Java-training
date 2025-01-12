package org.example;

public class MoneyBank {

    public static void main(String[] args) {

        double money = 100;
        double rate = 0.02; //금리 7프로

        //10년 거치
        for (int i=0; i<10; i++) {
            double interest = money*rate;
            money += interest;

            System.out.println("   " + money);
        }//end for
    }
}
