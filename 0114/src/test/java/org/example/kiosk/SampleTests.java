package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTests {

    @Test
    public void test1(){

        java.util.ArrayList<Menu> menuArrayList= MenuService.INSTANCE.getList();

//        //각각의 메뉴에 대해서 이런 함수를 실행하라
//        // f(x) => y (람다 lambda)
//        menuArrayList.forEach(menu -> System.out.println(menu));
//
//        Assertions.assertEquals(5, menuArrayList.size());

    }

    @Test
    public void test2(){

    }

}