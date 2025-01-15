package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class OrderItem {

    //메뉴 번호, 수량, 두개의 데이터로 구성
    private int menuNo;
    private int qty;
}
