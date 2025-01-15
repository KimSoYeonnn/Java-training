package org.example.kiosk.menu;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
public enum MenuService {

    //주어진 메뉴 데이터들을 제공하는 기능
    //CRUD : Create - Read - Update - Delete

    INSTANCE;

    //1. 메뉴들 보관
    private ArrayList<Menu> menus;

    //3. 초기화 근데 하나만 쓸거니까 enum으로 바꾸고 생성자 만들기
    private MenuService() {
        this.menus = new ArrayList<>();
        menus.add(new Menu(1, "Americano", 3000));
        menus.add(new Menu(2, "Latte", 3500));
        menus.add(new Menu(3, "Cappuccino", 4000));
        menus.add(new Menu(4, "Espresso", 2500));
    }

    //2. 로직잡기
    public ArrayList<Menu> getList(){

        log.trace("trace................");
        log.debug("debug.............");
        log.info("info.............");
        log.warn("warn..............");
        log.error("error.............");
        log.fatal("fatal................");

        //4. 내용 작성
        return menus;
    }

}
