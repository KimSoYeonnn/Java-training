package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CFConversion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("0 : Celsius to Fahrenheit   1 : Fahrenheit to Celsius");
        String str = br.readLine();
        // 정수로 변환
        int value = Integer.parseInt(str);

        switch (value) {
            case 0 -> {
                System.out.println("Enter Celsius");
                String str2 = br.readLine();
                double cel = Double.parseDouble(str2);

                // 계산식
                double result_f = cel * (9.0 / 5) + 32;

                // 결과 출력
                System.out.println("Fahrenheit is " + result_f);
            }
            case 1 -> {
                System.out.println("Enter Fahrenheit");
                String str3 = br.readLine();
                double fa = Double.parseDouble(str3);

                // 계산식
                double result_c = (fa - 32) * 5 / 9.0;

                // 결과 출력
                System.out.println("Celsius is " + result_c);
            }
            default -> System.out.println("Invalid input");
        }
    }
}
