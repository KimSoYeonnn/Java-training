package org.example;

import org.example.menu.*;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        //5. 매핑
        HashMap<String, MenuService> map = new HashMap<>();

        map.put("mege", new MegaMenuService());
        map.put("compose", new ComposeMenuService());

        //6.
        MenuService menuService = map.get("mega");
        menuService.getMenuList();

//        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
//        Document doc = Jsoup.connect(url).get();
//        //System.out.println(doc);
//
//        Element element = doc.selectFirst("#menu_list");
//        //System.out.println(element);
//
//
//        //두개씩 뜨니까 .text1 밑에 있는 b 태그만
//        Elements names = element.select(".text1 b");
//        //System.out.println(names);
//
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);

//        //전체 문서 홈페이지 화면 불러오기
//        Document doc = Jsoup.connect("https://composecoffee.com/menu?amp%3Bcategory=185").get();
//        //System.out.println(doc);
//
//        //id 검색
//        Element element = doc.selectFirst("#masonry-container");
//        //System.out.println(element);
//
//        //h4태그에 메뉴이름이 들어있으니까 태그 검색
//        Elements names = element.select("h4");
//        //System.out.println(names);
//
//        //메뉴 이름만 깨끗하게 들고오기
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);

        //#################################################
//        //추상 클래스(abstract 붙은애들)는 객체 생성 불가
//        //그치만 물려주거나 타입으로는 유용
//        Menu m = new Coffee(); // 가능
// //        Menu[] m = new Menu(); // 불가능


//        HashMap<String, BasicRes> resHashMap = new HashMap<>();
//
//        resHashMap.put("서울", new BasicRes());
//        resHashMap.put("부산", new BusanRes());
//        resHashMap.put("대구", new DaeguRes());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("도시를 입력하세요");
//        String city = scanner.nextLine();
//
//        BasicRes target = resHashMap.get(city);
//
//        target.makeZazang();

//        HashMap<String, String> wordMap = new HashMap<>();
//        wordMap.put("사과", "apple");
//        wordMap.put("복숭아", "peach");
//
//        String engWord = wordMap.get("사과");
//        System.out.println(engWord);


//        ArrayList<BasicRes> resList = new ArrayList<>();
//
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r -> {
//            r.makeZazang();
//        });
    }
}