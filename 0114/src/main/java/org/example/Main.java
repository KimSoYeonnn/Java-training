package org.example;

import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.card.CardPattern;
import org.example.kiosk.KioskUI;
import org.example.lots.LotsUI;
import org.example.vending.Scores;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        KioskUI ui = new KioskUI();
        ui.greeting();
        ui.makeOrder();
        ui.thanks();


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