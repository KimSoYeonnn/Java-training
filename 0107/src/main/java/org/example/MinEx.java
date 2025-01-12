package org.example;

public class MinEx {

    public static void main(String[] args) {

        int[] arr = {32, 34, 22, 13, 6, -3};

        int min = arr[0];
        int max = arr[0];

        for (int value: arr){

            min = value < min? value: min;
            max = value > max? value: max;


            //value값이 min보다 작으면 min을 value로 업데이트
//            if(value < min) {
//                min = value;
//            }//end if
//
//            //max값 구하기는 부등호만 반대
//            if(value > max){
//                max = value;
//            }//end if
        }//end for

        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);

    }
}
