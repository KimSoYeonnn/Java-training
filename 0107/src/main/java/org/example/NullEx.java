package org.example;

public class NullEx {

    public static void main(String[] args) {
        int[] arr =new int[3];

        arr = null;

        String str = null;
        System.out.println(str == null);
    }
}
