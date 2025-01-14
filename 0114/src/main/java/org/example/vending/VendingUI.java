package org.example.vending;

import java.util.Scanner;

public class VendingUI {

    //메서드들 공유할
    private Scanner scanner;
//    // 협력자 조력자
//    private VendingMachine vendingMachine;

//    public VendingUI(VendingMachine vm) {
//        this.scanner = new Scanner(System.in);
//        this.vendingMachine = vm;
//    }

    public void use() {

        outer:
        while (true){
            System.out.println("1.아아  2.티  3.밀크커피  4.종료");
            String oper = this.scanner.nextLine();

            switch (oper){
                case "1":
                    System.out.println(VendingMachine.INSTANCE.makeIA());
                    break;
                case "2":
                    System.out.println(VendingMachine.INSTANCE.makeTea());
                    break;
                case "3":
                    System.out.println(VendingMachine.INSTANCE.makeMilkCoffee());
                    break;
                case "4":
                    System.out.println("종료");
                    break outer;
            }//switch
        }//while


    }//use
}
