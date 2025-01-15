package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskUI {

    public void greeting() {
        System.out.println("안녕하세요!");
    }

    public void makeOrder() {

        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

        ArrayList<Menu> menus = MenuService.INSTANCE.getList();

        //주문 물어보기
        while (true){

            //메뉴 목록 보여주기
            menus.forEach(m -> System.out.println(m));

            System.out.println("메뉴번호를 입력하세요");
            int num = Integer.parseInt(scanner.nextLine());

            System.out.println("수량을 입력하세요");
            int qty = Integer.parseInt(scanner.nextLine());

            // orderItem을 만들수 있다.
            OrderItem orderItem = OrderItem.builder().menuNo(num).qty(qty).build();

            // 만든 orderItem을 order에 넣는다
            order.addOrderItem(orderItem);

            // while 탈출을 위한 준비
            System.out.println("주문을 계속 하실래요? y/n");
            String oper = scanner.nextLine();

            if (oper.equals("n")){
                break;
            }//if
        }//while
        //주문 끝

        // 주문 끝나면 주문번호 출력
        int num = OrderService.INSTANCE.addOrder(order);

        System.out.println("주문 번호 " + num);
    }

    public void thanks() {
        System.out.println("안녕히가세요 행복하세요");
    }

}
