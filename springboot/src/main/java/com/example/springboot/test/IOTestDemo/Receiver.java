package com.example.springboot.test.IOTestDemo;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/12/12.
 */
public class Receiver extends Thread {


    private PipedInputStream in=new PipedInputStream();
    public PipedInputStream getInputStream() {
        return in;
    }

    @Override
    public void run() {
        String s = null;
        byte [] buf = new byte[1024]; try {
            int len =in.read(buf);
            s = new String(buf,0,len);
            System.out.println("the following message comes from sender:\n"+s);
            in.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }






}
