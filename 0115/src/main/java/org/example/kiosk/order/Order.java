package org.example.kiosk.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Order {

    //주문번호
    private int ono;

    private ArrayList<OrderItem> orderItemList;

    public Order(){
        orderItemList = new  ArrayList<>();
    }

    //2. 새로운 OrderItem 추가
    public void addOrderItem(OrderItem newItem){
        orderItemList.add(newItem);

    }

}
