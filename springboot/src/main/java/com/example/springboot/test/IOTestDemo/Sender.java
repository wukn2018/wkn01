package com.example.springboot.test.IOTestDemo;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/12/12.
 */
public class Sender extends Thread{

    private PipedOutputStream out=new PipedOutputStream();

    public PipedOutputStream getOutputStream() {
        return out;
    }

    @Override
    public void run() {
        String s=new String("hello,receiver ,how are you");
        try {
        out.write(s.getBytes());
        out.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
