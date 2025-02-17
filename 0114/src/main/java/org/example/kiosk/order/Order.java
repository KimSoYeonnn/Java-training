package org.example.kiosk.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@Setter
public class Order {

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
