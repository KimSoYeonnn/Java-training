package org.example;

import java.util.Arrays;

public class Lotto1 {

    public static void main(String[] args) {

        // 결과물을 담은 배열
        int[] result = new int[6];
        int len = result.length;

        // 1 - 45 랜덤 숫자 만들기
        for (int i = 0; i < len; ) { // 인덱스는 중복이 없을 때만 증가
            int temp = (int) (Math.random() * 45) + 1;

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) { // 현재까지 저장된 값들과 비교
                if (result[j] == temp) {
                    isDuplicate = true;
                    break; // 중복이 있으면 루프 종료
                }
            }

            if (!isDuplicate) { // 중복이 없으면 저장
                result[i] = temp;
                i++; // 다음 인덱스로 이동
            }
        }

        // 결과 출력
        System.out.println("Lotto  "+Arrays.toString(result));
    }
}
