package org.example.lotto;

import lombok.Cleanup;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class HttpLottoServer {

    //bad code
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("LottoServer run.........");

        while (true){

            //브라우저와 연결해서 Socket을 생성해야 한다. -> accept()
            @Cleanup Socket socket = serverSocket.accept();
            //보내고 싶으니 OutputStream을 생성한다.
            @Cleanup OutputStream outputStream = socket.getOutputStream();

            //로또 번호 생성
            List<Integer> lottoballs = LottoBall.INSTANCE.getballs();

            //HTML 작성하기
            String html = "<h1>로또 번호 추첨</h1>" +  "<ul>";

            for (Integer number : lottoballs) {
                html += "<li>" + number + "</li>";
            }

            html += "</ul>";


            //HTTP에 맞는 image/jpeg 헤더 메시지를 outputStream에 기록
            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
            outputStream.write("Content-Type: text/html; charset=UTF-8;\r\n".getBytes());
            //outputStream.write(("Content-Length: " + target.length() + "\r\n").getBytes());
            outputStream.write("\r\n".getBytes());
            outputStream.write(html.getBytes());

        }//while

    }
}
