package org.example.menu;

import java.util.ArrayList;

//1. 얘는 추상메서드여서 abstract를 붙임
public abstract class MenuService {

    //2. 선언만 구현은 아님
    public abstract ArrayList<Menu> getMenuList();

}
