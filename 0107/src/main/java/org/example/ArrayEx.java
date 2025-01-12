package org.example;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {10, 30, 24, 32, 42, 15};

        for (int i=0; i < arr.length; i++){
        //성능을 중시한다면 int len=arr.length; for(int i=0;, i<len...) 이게 더 좋은 방법
            int value = arr[i]; //쓸데없이 루프를 돌 때마다 변수를 만들고 있는거임

            System.out.println(arr[i]);
        }//end for

        System.out.println("---------------");

        // 얘가 성능이 더 좋음
        for(int value: arr) {
            System.out.println(value);
        }

    }

}
