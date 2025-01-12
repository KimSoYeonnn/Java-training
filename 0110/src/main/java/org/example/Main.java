package org.example;

import org.example.save.SaveService;

import java.util.Scanner;

import org.example.save.SaveService;
import org.example.save.SaveUI;
import org.example.word.WordService;
import org.example.word.WordUI;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 필요한 객체 준비
        // 프로그램 시작

        WordService wordService = new WordService();
        WordUI wordUI = new WordUI(wordService);

        wordUI.exam();



//        SaveUI ui = new SaveUI();
//        ui.doJob();




    }//main
}//Main