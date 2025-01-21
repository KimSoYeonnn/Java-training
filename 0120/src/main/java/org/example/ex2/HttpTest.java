package org.example.ex2;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpTest {

    //bad code
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("Server Opened...");

        for (int i = 0; i < 10; i++) {
            byte[] arr = new byte[100 * 800];

            @Cleanup Socket client = serverSocket.accept();
            @Cleanup InputStream in = client.getInputStream();
            @Cleanup OutputStream out = client.getOutputStream();

            int count = in.read(arr); //몇 개나 새로운 데이터가 채워졌는지

            String str = new String(arr, 0, count);

            System.out.println(str);
            System.out.println("-------------------------");

            // HTTP 응답 작성
            String response = """
                            HTTP/1.1 200 OK
                            Content-Type: text/html; charset=UTF-8
                            
                            """;

            response += "<h1>" + WiseSayingService.INSTANCE.getOne() + "</h1>";

            byte[] msgArr = response.getBytes();
            out.write(msgArr);

        }//end for
    }
}

//------------------------------------------모바일
//GET / HTTP/1.1
//Host: 172.30.1.9:5555
//User-Agent: Mozilla/5.0 (iPhone; CPU iPhone OS 18_0_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0.1 Mobile/15E148 Safari/604.1
//Upgrade-Insecure-Requests: 1
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
//Accept-Language: ko-KR,ko;q=0.9
//Priority: u=0, i
//Accept-Encoding: gzip, deflate
//Connection: keep-alive


//------------------------------------------데스크탑
//GET / HTTP/1.1
//Host: 127.0.0.1:5555
//Connection: keep-alive
//sec-ch-ua: "Not A(Brand";v="8", "Chromium";v="132", "Google Chrome";v="132"
//sec-ch-ua-mobile: ?0
//sec-ch-ua-platform: "Windows"
//Upgrade-Insecure-Requests: 1
//User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36
//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
//Sec-Fetch-Site: none
//Sec-Fetch-Mode: navigate
//Sec-Fetch-User: ?1
//Sec-Fetch-Dest: document
//Accept-Encoding: gzip, deflate, br, zstd
//Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7