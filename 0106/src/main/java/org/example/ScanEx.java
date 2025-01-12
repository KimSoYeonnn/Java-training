package org.example;

import java.util.Scanner;

public class ScanEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("AGE");

        String str = scanner.nextLine();
        System.out.println(str);

        int age = Integer.parseInt(str);

        if (age>= 18){
            System.out.println("Adults");
        }else {
            System.out.println("Minors");
        }
    }
}
