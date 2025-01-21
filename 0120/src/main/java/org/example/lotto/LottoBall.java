package org.example.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum LottoBall {

    INSTANCE;

    public List<Integer> getballs(){
        List<Integer> ballList = new ArrayList<>();

        for (int i = 1; i <= 45 ; i++) {
            ballList.add(i);
        }

        Collections.shuffle(ballList);

        return ballList.subList(0, 6);
    }
}
