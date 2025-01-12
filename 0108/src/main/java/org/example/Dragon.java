package org.example;

public class Dragon {

    boolean hungry;

    public void eatHuman(){

        if(this.hungry == false){
            System.out.println("No thanks I'm full.");
            return;
        }
        System.out.println("Yummmm");
        this.hungry = false;
    }

    public void makeFire(){

        if(hungry){
            System.out.println("I'm Sorry. I'm full");
            return;
        }

        System.out.println("~~~~~~~~");
        System.out.println("~~~~~~~~");
        this.hungry = true;
    }
}
