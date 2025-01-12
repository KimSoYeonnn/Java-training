package org.example.yesnotest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Question {
    private String text;
    private int yesIndex;
    private int noIndex;

    public Question(String text, int yesIndex, int noIndex) {
        this.text = text;
        this.yesIndex = yesIndex;
        this.noIndex = noIndex;
    }
}
