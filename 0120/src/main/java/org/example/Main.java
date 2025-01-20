package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {

    //bad code
    public static void main(String[] args) throws Exception {

        String path = "http://mp4.cine21.com/cine21/multi/trailer/a-b/banzi_pre_2.mp4";
        URL url = new URL(path);
        InputStream in = url.openStream();


        //Menu = m = new PizzaMenu();
        //InputStream in = new FileInputStream("C:\\zzz\\aaa.jpeg");
        OutputStream out = new FileOutputStream("C:\\zzz\\copy.mp4");

        while (true){

            int data = in.read();

            //System.out.println(data);

            if(data==-1){
                break;
            }

            out.write(data);
        }


        //모든 빨대(stream)는 사용 후 닫는다
        in.close();
        out.close();
    }
}