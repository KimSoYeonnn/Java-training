package org.example;

import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.card.CardPattern;
import org.example.ex.Ex1;
import org.example.kiosk.KioskUI;
import org.example.lots.LotsUI;
import org.example.vending.Scores;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<LottoBall> ballList = new ArrayList<>();

        for (int i = 1; i <= 45 ; i++) {
            ballList.add(new LottoBall(i));
        }

        Collections.shuffle(ballList);

        List<LottoBall> result = ballList.subList(0,6);
        System.out.println(result);

        result.sort((b1, b2) -> b1.getNum() - b2.getNum());

        System.out.println(result);

//        Ex1 obj1 = new Ex1();
//        Ex1 obj2 = new Ex1();


//        KioskUI ui = new KioskUI();
//        ui.greeting();
//        ui.makeOrder();
//        ui.thanks();


//        Card userCard = CardDeck.INSTANCE.getOne();
//        Card comCard = CardDeck.INSTANCE.getOne();
//
//        System.out.println(userCard);
//        System.out.println(comCard);

//        LotsUI ui = new LotsUI();
//        ui.startGame();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("꽝");
//        list.add("꽝");
//        list.add("당첨");
//
//        Collections.shuffle(list);
//
//        System.out.println(list);
//
//
//        //remove(0)
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list);
    }
}