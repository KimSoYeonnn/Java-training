package org.example.ui;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public abstract class BasicUI {

    private final Scanner scanner;

    //하위에 물려주고 싶은 기능은 키보드에 입력 받는 기능
    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public int inputInt(String msg){
        return Integer.parseInt(input(msg));
    }

    public abstract void execute();
}
