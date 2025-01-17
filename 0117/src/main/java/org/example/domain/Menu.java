package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Menu {

    //1. 변수설정
    //메뉴 번호
    protected int mno;
    //메뉴 이름
    protected String name;
    //메뉴 가격
    protected int price;
}
