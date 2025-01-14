package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

public enum CardDeck {

    INSTANCE;

    private ArrayList<Card> cards;

    private CardDeck(){
        this.cards = new ArrayList<>();

        // 카드 만들기
        for (CardPattern pattern : CardPattern.values()) { // 무늬 결정
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(pattern, i)); // 카드 생성
            }
        }

        Collections.shuffle(cards);
    }

    //임의의 카드 뽑기
    public Card getOne() {
        Card card = cards.remove(0);
        return card;
    }
}
