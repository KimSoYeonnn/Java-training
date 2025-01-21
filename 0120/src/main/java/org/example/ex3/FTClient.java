package org.example.ex3;

import lombok.Cleanup;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FTClient {

    //bad code
    public static void main(String[] args) throws Exception{

        @Cleanup
        Socket socket = new Socket("127.0.0.1", 5555);

        @Cleanup
        InputStream in = socket.getInputStream();


        @Cleanup
        FileOutputStream fos = new FileOutputStream("today.jpg");

        byte[] buffer = new byte[1034];

        System.out.println("전송된 데이터 읽기 시작");

        while (true){
            int count = in.read(buffer);
            System.out.println(count);
            if (count==-1){break;}

            fos.write(buffer, 0, count);

        }//while


    }

}
